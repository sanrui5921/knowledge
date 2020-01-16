package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0698Test {

    Solution_0698 solution;

    @Before
    public void init() {
        solution = new Solution_0698();
    }

    @Test
    public void test1() {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        Assert.assertEquals(true, solution.canPartitionKSubsets(nums, k));
    }
}
