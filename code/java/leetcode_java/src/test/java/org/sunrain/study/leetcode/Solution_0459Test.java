package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0459Test {

    Solution_0459 solution;

    @Before
    public void init() {
        solution = new Solution_0459();
    }

    @Test
    public void test1() {
        String str = "abab";
        Assert.assertEquals(true, solution.repeatedSubstringPattern(str));
    }

    @Test
    public void test2() {
        String str = "aba";
        Assert.assertEquals(false, solution.repeatedSubstringPattern(str));
    }


    @Test
    public void test3() {
        String str = "abcabcabcabc";
        Assert.assertEquals(true, solution.repeatedSubstringPattern(str));
    }
}
