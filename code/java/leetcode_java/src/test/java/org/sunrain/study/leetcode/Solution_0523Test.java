package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/20.
 */
public class Solution_0523Test {

    Solution_0523 solution;

    @Before
    public void init() {
        solution = new Solution_0523();
    }

    @Test
    public void test1() {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        Assert.assertEquals(true, solution.checkSubarraySum(nums, k));
    }

    @Test
    public void test2() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        Assert.assertEquals(true, solution.checkSubarraySum(nums, k));
    }
}
