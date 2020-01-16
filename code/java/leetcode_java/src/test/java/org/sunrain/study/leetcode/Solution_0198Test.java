package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0198Test {

    Solution_0198 solution;

    @Before
    public void init() {
        this.solution = new Solution_0198();
    }

    @Test
    public void maxProfitTest1() {
        int[] arrays = {1, 2, 3, 1};
        Assert.assertEquals(4, solution.rob(arrays));
    }

    @Test
    public void maxProfitTest2() {
        int[] arrays = {2, 7, 9, 3, 1};
        Assert.assertEquals(12, solution.rob(arrays));
    }

    @Test
    public void maxProfitTest3() {
        int[] arrays = {};
        Assert.assertEquals(0, solution.rob(arrays));
    }

    @Test
    public void maxProfitTest4() {
        int[] arrays = null;
        Assert.assertEquals(0, solution.rob(arrays));
    }

    @Test
    public void maxProfitTest5() {
        int[] arrays = {1, 2};
        Assert.assertEquals(2, solution.rob(arrays));
    }

    @Test
    public void maxProfitTest6() {
        int[] arrays = {2, 1, 1, 2};
        Assert.assertEquals(4, solution.rob(arrays));
    }

    @Test
    public void maxProfitTest7() {
        int[] arrays = {1, 3, 1, 3, 100};
        Assert.assertEquals(103, solution.rob(arrays));
    }
}
