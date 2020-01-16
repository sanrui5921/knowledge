package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0003Test {

    Solution_0003 solution;

    @Before
    public void init() {
        solution = new Solution_0003();
    }

    @Test
    public void test1() {
        String str = "abcabcbb";
        Assert.assertEquals(3, solution.lengthOfLongestSubstring(str));
    }

    @Test
    public void test2() {
        String str = "bbbbb";
        Assert.assertEquals(1, solution.lengthOfLongestSubstring(str));
    }

    @Test
    public void test3() {
        String str = "pwwkew";
        Assert.assertEquals(3, solution.lengthOfLongestSubstring(str));
    }

    @Test
    public void test4() {
        String str = "";
        Assert.assertEquals(0, solution.lengthOfLongestSubstring(str));
    }

    @Test
    public void test5() {
        String str = " ";
        Assert.assertEquals(1, solution.lengthOfLongestSubstring(str));
    }

    @Test
    public void test6() {
        String str = "au";
        Assert.assertEquals(2, solution.lengthOfLongestSubstring(str));
    }
}
