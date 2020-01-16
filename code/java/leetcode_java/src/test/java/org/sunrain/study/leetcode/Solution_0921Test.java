package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0921Test {

    Solution_0921 solution;

    @Before
    public void init() {
        this.solution = new Solution_0921();
    }

    @Test
    public void test1() {
        String str = "())";
        Assert.assertEquals(1, solution.minAddToMakeValid(str));
    }

    @Test
    public void test2() {
        String str = "(((";
        Assert.assertEquals(3, solution.minAddToMakeValid(str));
    }

    @Test
    public void test3() {
        String str = "()";
        Assert.assertEquals(0, solution.minAddToMakeValid(str));
    }

    @Test
    public void test4() {
        String str = "()))((";
        Assert.assertEquals(4, solution.minAddToMakeValid(str));
    }
}
