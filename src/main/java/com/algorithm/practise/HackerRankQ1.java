package com.algorithm.practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author joel.eze
 */
public class HackerRankQ1 {

    public static void main(String[] args) {
//        System.out.println(countSetBits(161));
//        System.out.println(bitPositions(161));
//
//        int n = 161;
//
//        long count = 0;
//        //This performs a basic conversion from int to binary using divide by two and checking even or odd
//        while (n != 0) {
//            count += (n % 2 == 0) ? 1 : 0;
//            n /= 2;
//        }
//        count = (long) Math.pow(2, count);
//        System.out.println(count);

        //countBits(161);
        System.out.println(countSetBits(161));
       // System.out.println(countBits(161));
        //System.out.println(countBitsx(161));
        int[] array = countBitsx(161);
        for (int a : array) {
            //  System.out.println(a);
        }

    }
//
//    public static int[] countBits(int x) {
//        String binaryStr = Integer.toBinaryString(x);
//        int length = binaryStr.length();
//        List list = new ArrayList();
//        list.add(countSetBits(x));
//        for (int i = 0; i < length; i++) {
//            if (binaryStr.charAt(i) == '1') {
//                System.out.println(i + 1);
//                list.add(i + 1);
//            }
//        }
//        return list.stream().mapToInt(i->i).toArray();
//    }

    public static List<Integer> BitOccurencesAscending(int number) {
        LinkedList<Integer> out = new LinkedList<>();
        int x = number;
        while (number > 0) {
            x = Integer.lowestOneBit(number);
            number -= x;
            x = Integer.numberOfTrailingZeros(x);
            out.add(x);
        }
        return out;
    }

    public static int[] countBitsx(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = humming(i);
        }
        return result;
    }

    static int humming(int i) {
        int result = 0;
        while (i != 0) {
            result += i & 1;
            i >>>= 1;
        }
        return result;
    }

    public static int convert(int num, int base) {
        if (num == 0) {
            return 0;
        } else {
            return convert(num / base, base) + (num % base);
        }
    }

    private static List<Integer> bitPositions(int number) {
        List<Integer> positions = new ArrayList<>();
        int position = 1;
        while (number != 0) {
            if ((number & 1) != 0) {
                positions.add(position);
            }
            position++;
            number = number >> 1;
        }
        return positions;
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
