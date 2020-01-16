package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0682Test {

    Solution_0682 solution;

    @Before
    public void init() {
        solution = new Solution_0682();
    }

    @Test
    public void test1() {
        String[] strs = {"5", "2", "C", "D", "+"};
        Assert.assertEquals(30, solution.calPoints(strs));
    }

    @Test
    public void test2() {
        String[] strs = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        Assert.assertEquals(27, solution.calPoints(strs));
    }
}
