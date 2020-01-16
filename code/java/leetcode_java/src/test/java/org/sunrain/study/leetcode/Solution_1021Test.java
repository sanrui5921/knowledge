package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_1021Test {

    Solution_1021 solution;

    @Before
    public void init() {
        solution = new Solution_1021();
    }

    @Test
    public void test1() {
        String str = "(()())(())";
        Assert.assertEquals("()()()", solution.removeOuterParentheses(str));
    }

    @Test
    public void test2() {
        String str = "(()())(())(()(()))";
        Assert.assertEquals("()()()()(())", solution.removeOuterParentheses(str));
    }

    @Test
    public void test3() {
        String str = "()()";
        Assert.assertEquals("", solution.removeOuterParentheses(str));
    }
}
