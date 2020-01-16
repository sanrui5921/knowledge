package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0020Test {

    Solution_0020 solution_0020;

    @Before
    public void init() {
        solution_0020 = new Solution_0020();
    }

    @Test
    public void isValidTest1() {
        String str = "()";
        Assert.assertEquals(solution_0020.isValid(str), true);
    }

    @Test
    public void isValidTest2() {
        String str = "()[]{}";
        Assert.assertEquals(solution_0020.isValid(str), true);
    }

    @Test
    public void isValidTest3() {
        String str = "(]";
        Assert.assertEquals(solution_0020.isValid(str), false);
    }

    @Test
    public void isValidTest4() {
        String str = "([)]";
        Assert.assertEquals(solution_0020.isValid(str), false);
    }

    @Test
    public void isValidTest5() {
        String str = "{[]}";
        Assert.assertEquals(solution_0020.isValid(str), true);
    }
}
