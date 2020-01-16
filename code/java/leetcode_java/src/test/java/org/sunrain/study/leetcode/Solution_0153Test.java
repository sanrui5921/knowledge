package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0153Test {

    Solution_0153 solution;

    @Before
    public void init() {
        solution = new Solution_0153();
    }

    @Test
    public void findMinTest1() {
        int[] array = {3, 4, 5, 1, 2};
        Assert.assertEquals(1, solution.findMin(array));
    }

    @Test
    public void findMinTest2() {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        Assert.assertEquals(0, solution.findMin(array));
    }

    @Test
    public void findMinTest3() {
        int[] array = {4, 5, 1, 2, 3};
        Assert.assertEquals(1, solution.findMin(array));
    }
}
