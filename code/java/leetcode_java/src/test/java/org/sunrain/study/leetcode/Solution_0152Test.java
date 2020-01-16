package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0152Test {

    Solution_0152 solution;

    @Before
    public void init() {
        this.solution = new Solution_0152();
    }

    @Test
    public void maxProfitTest1() {
        int[] arrays = {2, 3, -2, 4};
        Assert.assertEquals(6, solution.maxProduct(arrays));
    }

    @Test
    public void maxProfitTest2() {
        int[] arrays = {-2, 0, -1};
        Assert.assertEquals(0, solution.maxProduct(arrays));
    }

    @Test
    public void maxProfitTest3() {
        int[] arrays = {};
        Assert.assertEquals(0, solution.maxProduct(arrays));
    }

    @Test
    public void maxProfitTest4() {
        int[] arrays = null;
        Assert.assertEquals(0, solution.maxProduct(arrays));
    }
}
