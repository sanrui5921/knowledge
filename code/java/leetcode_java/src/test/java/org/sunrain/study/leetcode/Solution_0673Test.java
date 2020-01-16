package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0673Test {

    Solution_0673 solution;

    @Before
    public void init() {
        solution = new Solution_0673();
    }

    @Test
    public void test1() {
        int[] nums = {1, 3, 5, 4, 7};
        Assert.assertEquals(2, solution.findNumberOfLIS(nums));
    }

    @Test
    public void test2() {
        int[] nums = {2, 2, 2, 2, 2};
        Assert.assertEquals(5, solution.findNumberOfLIS(nums));
    }
}
