package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListUtils;

public class Solution_0368Test {

    Solution_0368 solution;

    @Before
    public void init() {
        solution = new Solution_0368();
    }

    @Test
    public void test1() {
        int[] nums = {1, 2, 3};
        Assert.assertEquals("[1,2]", ListUtils.show(solution.largestDivisibleSubset(nums)));
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 4, 8};
        Assert.assertEquals("[1,2,4,8]", ListUtils.show(solution.largestDivisibleSubset(nums)));
    }

    @Test
    public void test3() {
        int[] nums = {4, 8, 10, 240};
        Assert.assertEquals("[4,8,240]", ListUtils.show(solution.largestDivisibleSubset(nums)));
    }
}
