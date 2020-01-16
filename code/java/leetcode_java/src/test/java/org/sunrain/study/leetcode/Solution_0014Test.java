package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0014Test {

    Solution_0014 solution;

    @Before
    public void init() {
        solution = new Solution_0014();
    }

    @Test
    public void test1() {
        String[] strs = {"flower", "flow", "flight"};
        Assert.assertEquals("fl", solution.longestCommonPrefix(strs));
    }


    @Test
    public void test2() {
        String[] strs = {"dog", "racecar", "car"};
        Assert.assertEquals("", solution.longestCommonPrefix(strs));
    }
}
