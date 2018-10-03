package com.app;

public class Main {

    public static void main(String[] args) {
        int[][] m = {
                {1, 22}
        };
        System.out.println(m[0].length); // 2
        System.out.println(m.length); // 1
        System.out.println(m[0][1]); // 22

        Solution solution = new Solution();
        int[][] a = {
                {1, 0, 2, 4},
                {3, 2, 1, 5},
                {1, 1, 1, 1}

        };
        solution.solution(a);
        System.out.println();
    }
}
