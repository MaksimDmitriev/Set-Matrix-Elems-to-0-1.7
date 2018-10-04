package com.app;

public class Solution {

    // You can assume that the input matrix has at most 32 columns and rows.
    public void solution(int[][] matrix) {
        long mask = 0;
        // the right 32 bits for columns
        // the left 32 bits for rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    mask |= (1L << i);
                    mask |= (1L << (j + 32));
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((mask & (1L << i)) != 0 || (mask & (1L << (j + 32))) != 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
