package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/16.
 */
public class Solution_0136Test {

    Solution_0136 solution;

    @Before
    public void init() {
        solution = new Solution_0136();
    }

    @Test
    public void singleNumberTest1() {
        int[] nums = {2, 2, 1};
        Assert.assertEquals(1, solution.singleNumber(nums));
    }

    @Test
    public void singleNumberTest2() {
        int[] nums = {4, 1, 2, 1, 2};
        Assert.assertEquals(4, solution.singleNumber(nums));
    }
}
