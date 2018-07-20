/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algostuff;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author joel.eze
 */
public class NumberEncoding {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
            
        }
        
        int[] num = {25626, 25757, 24367, 24267, 16, 100, 2, 7277};
        System.out.println(encodeNumber(num));
    }

    public static String encodeNumber(int[] numbers) {
        // To store ordered list of encoded numbers 
        LinkedList<Integer> list = new LinkedList<>();

        // The first number is not encoded
        list.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            int diff = numbers[i] - numbers[i - 1];
            if (diff < -127 || diff > 127) {
                list.add(-128);
            }
            list.add(diff);
        }

        return getEncodedResult(list);
    }

    private static String getEncodedResult(LinkedList<Integer> numList) {
        StringBuffer result = new StringBuffer();
        numList.stream().forEach(a -> result.append(a + " "));
        return result.toString().trim();
    }

}
