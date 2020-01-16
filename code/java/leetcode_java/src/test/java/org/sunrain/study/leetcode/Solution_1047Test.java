package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_1047Test {

    Solution_1047 solution;

    @Before
    public void init() {
        solution = new Solution_1047();
    }

    @Test
    public void test1() {
        String str = "abbaca";
        Assert.assertEquals("ca", solution.removeDuplicates(str));
    }
}
