package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0258Test {

    Solution_0258 solution;

    @Before
    public void init() {
        solution = new Solution_0258();
    }

    @Test
    public void test1() {
        Assert.assertEquals(2, solution.addDigits(38));
    }
}
