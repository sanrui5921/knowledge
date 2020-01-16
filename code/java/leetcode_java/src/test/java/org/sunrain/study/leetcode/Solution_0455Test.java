package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/16.
 */
public class Solution_0455Test {

    Solution_0455 solution;

    @Before
    public void init() {
        solution = new Solution_0455();
    }

    @Test
    public void test1() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        Assert.assertEquals(1, solution.findContentChildren(g, s));
    }

    @Test
    public void test2() {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        Assert.assertEquals(2, solution.findContentChildren(g, s));
    }

    @Test
    public void test3() {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        Assert.assertEquals(2, solution.findContentChildren(g, s));
    }
}
