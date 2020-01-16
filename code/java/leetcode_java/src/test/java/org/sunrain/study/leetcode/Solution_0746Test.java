package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0746Test {

    Solution_0746 solution;

    @Before
    public void init() {
        solution = new Solution_0746();
    }

    @Test
    public void minCostClimbingStairsTest1() {
        int[] array = {10, 15, 20};
        Assert.assertEquals(15, solution.minCostClimbingStairs(array));
    }

    @Test
    public void minCostClimbingStairsTest2() {
        int[] array = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Assert.assertEquals(6, solution.minCostClimbingStairs(array));
    }
}
