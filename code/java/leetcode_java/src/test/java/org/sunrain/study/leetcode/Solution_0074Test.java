package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0074Test {

    Solution_0074 solution;

    @Before
    public void init() {
        solution = new Solution_0074();
    }

    @Test
    public void searchMatrixTest1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        Assert.assertEquals(true, solution.searchMatrix(matrix, 3));
    }

    @Test
    public void searchMatrixTest2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        Assert.assertEquals(false, solution.searchMatrix(matrix, 13));
    }

    @Test
    public void searchMatrixTest3() {
        int[][] matrix = {{}};
        Assert.assertEquals(false, solution.searchMatrix(matrix, 13));
    }
}
