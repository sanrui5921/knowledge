package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by qichao on 2019/11/16.
 */
public class Solution_0018Test {

    Solution_0018 solution;

    @Before
    public void init() {
        solution = new Solution_0018();
    }

    @Test
    public void fourSumTest1() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = solution.fourSum(nums, target);
        Assert.assertEquals(3, result.size());
    }
}
