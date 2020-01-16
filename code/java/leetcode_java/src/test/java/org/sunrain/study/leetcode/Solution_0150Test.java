package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0150Test {

    Solution_0150 solution;

    @Before
    public void init() {
        solution = new Solution_0150();
    }

    @Test
    public void test1() {
        String[] array = {"2", "1", "+", "3", "*"};
        Assert.assertEquals(9, solution.evalRPN(array));
    }

    @Test
    public void test2() {
        String[] array = {"4", "13", "5", "/", "+"};
        Assert.assertEquals(6, solution.evalRPN(array));
    }

    @Test
    public void test3() {
        String[] array = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Assert.assertEquals(22, solution.evalRPN(array));
    }
}
