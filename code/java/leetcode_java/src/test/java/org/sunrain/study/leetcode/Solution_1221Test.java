package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_1221Test {

    Solution_1221 solution;

    @Before
    public void init() {
        solution = new Solution_1221();
    }

    @Test
    public void test1() {
        String str = "RLRRLLRLRL";
        Assert.assertEquals(4, solution.balancedStringSplit(str));
    }

    @Test
    public void test2() {
        String str = "RLLLLRRRLR";
        Assert.assertEquals(3, solution.balancedStringSplit(str));
    }

    @Test
    public void test3() {
        String str = "LLLLRRRR";
        Assert.assertEquals(1, solution.balancedStringSplit(str));
    }
}
