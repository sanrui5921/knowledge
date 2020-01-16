package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_1003Test {

    Solution_1003 solution;

    @Before
    public void init() {
        solution = new Solution_1003();
    }

    @Test
    public void test1() {
        String str = "aabcbc";
        Assert.assertEquals(true, solution.isValid(str));
    }

    @Test
    public void test2() {
        String str = "abcabcababcc";
        Assert.assertEquals(true, solution.isValid(str));
    }

    @Test
    public void test3() {
        String str = "abccba";
        Assert.assertEquals(false, solution.isValid(str));
    }

    @Test
    public void test4() {
        String str = "cababc";
        Assert.assertEquals(false, solution.isValid(str));
    }
}
