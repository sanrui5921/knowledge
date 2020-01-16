package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0121Test {

    Solution_0121 solution;

    @Before
    public void init() {
        this.solution = new Solution_0121();
    }

    @Test
    public void maxProfitTest1() {
        int[] arrays = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(5, solution.maxProfit1(arrays));
    }

    @Test
    public void maxProfitTest2() {
        int[] arrays = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, solution.maxProfit1(arrays));
    }

    @Test
    public void maxProfitTest3() {
        int[] arrays = {};
        Assert.assertEquals(0, solution.maxProfit1(arrays));
    }

    @Test
    public void maxProfitTest4() {
        int[] arrays = null;
        Assert.assertEquals(0, solution.maxProfit1(arrays));
    }
}
