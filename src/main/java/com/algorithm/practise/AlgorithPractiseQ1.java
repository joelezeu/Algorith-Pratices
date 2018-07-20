package com.algorithm.practise;

import java.util.Arrays;

/**
 *
 * @author joel.eze
 */
public class AlgorithPractiseQ1 {
    //How to find duplicate number on Integer array in Java

    public static void main(String[] args) {
        int[] array_of_number = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < array_of_number.length; i++) {
            for (int k = i + 1; k < array_of_number.length; k++) {
                if (array_of_number[i] == array_of_number[k] && (i != k)) {
                    System.out.println("Duplicates " + array_of_number[i]);
                }
            }
        }
        System.out.println(Arrays.asList(array_of_number).contains(5));
    }
//    public static void main(String[] args) {
//        int[] myArray = {2, 4, 3, 5, 2, 5, 2};
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[0] == myArray[i]) {
//                System.out.println("Dupicate array of index " + i + " Element of = " + myArray[i]);
//            }
//        }
//    }

}
