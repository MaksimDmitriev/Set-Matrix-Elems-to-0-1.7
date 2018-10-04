package com.app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void empty() {
        Solution solution = new Solution();
        int[][] m = {};
        solution.solution(m);
        assertTrue(Arrays.deepEquals(new int[][]{}, m));
    }

    @Test
    void singleElement() {
        Solution solution = new Solution();
        int[][] m = {
                {1}
        };
        solution.solution(m);
        assertTrue(Arrays.deepEquals(new int[][]{
                {1}
        }, m));
    }

    @Test
    void singleElementZero() {
        Solution solution = new Solution();
        int[][] m = {
                {0}
        };
        solution.solution(m);
        assertTrue(Arrays.deepEquals(new int[][]{
                {0}
        }, m));
    }

    @Test
    void singleRow() {
        Solution solution = new Solution();
        int[][] m = {
                {1, 2}
        };
        solution.solution(m);
        assertTrue(Arrays.deepEquals(new int[][]{
                {1, 2}
        }, m));
    }

    @Test
    void singleRowWithZero() {
        Solution solution = new Solution();
        int[][] m = {
                {1, 0}
        };
        solution.solution(m);
        assertTrue(Arrays.deepEquals(new int[][]{
                {0, 0}
        }, m));
    }

    @Test
    void singleColumn() {
        Solution solution = new Solution();
        int[][] m = {
                {1},
                {2}
        };
        solution.solution(m);
        assertTrue(Arrays.deepEquals(new int[][]{
                {1},
                {2}
        }, m));
    }

    @Test
    void singleColumnWithZero() {
        Solution solution = new Solution();
        int[][] m = {
                {1},
                {0}
        };
        solution.solution(m);
        assertTrue(Arrays.deepEquals(new int[][]{
                {0},
                {0}
        }, m));
    }

    @Test
    void multipleColsAndRows() {
        Solution solution = new Solution();
        int[][] m = {
                {1, 2, 3},
                {0, 6, 7},
                {23, 56, 71}
        };
        solution.solution(m);
        assertTrue(Arrays.deepEquals(new int[][]{
                {0, 2, 3},
                {0, 0, 0},
                {0, 56, 71}
        }, m));
    }

}