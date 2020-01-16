package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0650Test {

    Solution_0650 solution;

    @Before
    public void init() {
        solution = new Solution_0650();
    }

    @Test
    public void test1() {
        Assert.assertEquals(3, solution.minSteps(3));
    }

    @Test
    public void test2() {
        Assert.assertEquals(7, solution.minSteps(12));
    }
}
