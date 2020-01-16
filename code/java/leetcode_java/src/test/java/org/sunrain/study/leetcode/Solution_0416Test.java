package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0416Test {

    Solution_0416 solution;

    @Before
    public void init() {
        solution = new Solution_0416();
    }

    @Test
    public void test1() {
        int[] array = {1, 5, 11, 5};
        Assert.assertEquals(true, solution.canPartition(array));
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 3, 5};
        Assert.assertEquals(false, solution.canPartition(array));
    }
}
