package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/7.
 */
public class Solution_0070Test {

    Solution_0070 solution;

    @Before
    public void init() {
        solution = new Solution_0070();
    }

    @Test
    public void climbStairsTest1() {
        Assert.assertEquals(3, solution.climbStairs(3));
    }
}
