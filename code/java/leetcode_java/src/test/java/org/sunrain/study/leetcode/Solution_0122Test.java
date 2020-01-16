package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0122Test {

    Solution_0122 solution;

    @Before
    public void init() {
        this.solution = new Solution_0122();
    }

    @Test
    public void maxProfitTest1() {
        int[] arrays = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(7, solution.maxProfit(arrays));
    }

    @Test
    public void maxProfitTest2() {
        int[] arrays = {1, 2, 3, 4, 5};
        Assert.assertEquals(4, solution.maxProfit(arrays));
    }

    @Test
    public void maxProfitTest3() {
        int[] arrays = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, solution.maxProfit(arrays));
    }

    @Test
    public void maxProfitTest4() {
        int[] arrays = {};
        Assert.assertEquals(0, solution.maxProfit(arrays));
    }

    @Test
    public void maxProfitTest5() {
        int[] arrays = null;
        Assert.assertEquals(0, solution.maxProfit(arrays));
    }
}
