package com.algorithm.hackerank;

/**
 *
 * @author joel.eze
 */
public class MultiArray {
    

    public static void main(String args[]) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6, 9},
            {7},};

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                System.out.print(a[i][k] + " ");
            }
            //System.out.println();
        }
    }
}
