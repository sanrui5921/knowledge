package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_1137Test {

    Solution_1137 solution;

    @Before
    public void init() {
        solution = new Solution_1137();
    }

    @Test
    public void test1() {
        Assert.assertEquals(4, solution.tribonacci(4));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1389537, solution.tribonacci(25));
    }

    @Test
    public void test3() {
        Assert.assertEquals(15902591, solution.tribonacci(29));
    }
}
