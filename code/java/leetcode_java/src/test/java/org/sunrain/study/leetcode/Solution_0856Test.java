package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0856Test {

    Solution_0856 solution;

    @Before
    public void init() {
        solution = new Solution_0856();
    }

    @Test
    public void test1() {
        String str = "()";
        Assert.assertEquals(1, solution.scoreOfParentheses(str));
    }

    @Test
    public void test2() {
        String str = "(())";
        Assert.assertEquals(2, solution.scoreOfParentheses(str));
    }

    @Test
    public void test3() {
        String str = "()()";
        Assert.assertEquals(4, solution.scoreOfParentheses(str));
    }

    @Test
    public void test4() {
        String str = "(()(()))";
        Assert.assertEquals(6, solution.scoreOfParentheses(str));
    }
}
