package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_1005Test {

    Solution_1005 solution;

    @Before
    public void init() {
        solution = new Solution_1005();
    }

    @Test
    public void test1() {
        int[] array = {4, 2, 3};
        Assert.assertEquals(5, solution.largestSumAfterKNegations(array, 1));
    }

    @Test
    public void test2() {
        int[] array = {3, -1, 0, 2};
        Assert.assertEquals(6, solution.largestSumAfterKNegations(array, 3));
    }

    @Test
    public void test3() {
        int[] array = {2, -3, -1, 5, -4};
        Assert.assertEquals(13, solution.largestSumAfterKNegations(array, 2));
    }
}
