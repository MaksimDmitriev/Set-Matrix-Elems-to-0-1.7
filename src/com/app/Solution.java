package com.app;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public void solution(int[][] matrix) {
        Set<Integer> cols = new HashSet<>();
        Set<Integer> rows = new HashSet<>();

        int rowCount = matrix.length;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    continue;
                }
                if (matrix[i][j] == 0) {
                    // set all values of row x to 0
                    int x = 0;
                    while (x < matrix[i].length) {
                        matrix[i][x] = 0;
                        x++;
                    }
                    // set all values of col y to 0
                    int y = 0;
                    while (y < rowCount) {
                        matrix[y][j] = 0;
                        y++;
                    }
                    cols.add(j);
                    rows.add(i);
                }
            }
        }
    }
}
