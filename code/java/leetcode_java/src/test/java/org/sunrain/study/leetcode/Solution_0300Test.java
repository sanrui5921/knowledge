package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0300Test {

    Solution_0300 solution;

    @Before
    public void init() {
        solution = new Solution_0300();
    }

    @Test
    public void test1() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        Assert.assertEquals(4, solution.lengthOfLIS(nums));
    }

    @Test
    public void test2() {
        int[] nums = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        Assert.assertEquals(6, solution.lengthOfLIS(nums));
    }
}
