package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/7.
 */
public class Solution_0053Test {

    Solution_0053 solution;

    @Before
    public void init() {
        solution = new Solution_0053();
    }

    @Test
    public void maxSubArrayTest1() {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, solution.maxSubArray(array));
    }
}
