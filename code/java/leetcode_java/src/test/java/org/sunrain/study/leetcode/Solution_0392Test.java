package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0392Test {

    Solution_0392 solution;

    @Before
    public void init() {
        solution = new Solution_0392();
    }

    @Test
    public void isSubsequenceTest1() {
        String s = "abc", t = "ahbgdc";
        Assert.assertEquals(true, solution.isSubsequence(s, t));
    }

    @Test
    public void isSubsequenceTest2() {
        String s = "axc", t = "ahbgdc";
        Assert.assertEquals(false, solution.isSubsequence(s, t));
    }

    @Test
    public void isSubsequenceTest3() {
        String s = "acb", t = "ahbgdc";
        Assert.assertEquals(false, solution.isSubsequence(s, t));
    }
}
