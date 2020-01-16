package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_1124Test {

    Solution_1124 solution;

    @Before
    public void init() {
        solution = new Solution_1124();
    }

    @Test
    public void test1() {
        int[] hours = {9, 9, 6, 0, 6, 6, 9};
        int result = solution.longestWPI(hours);
        Assert.assertEquals(3, result);
    }
}
