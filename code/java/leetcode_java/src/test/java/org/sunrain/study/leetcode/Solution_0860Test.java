package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/16.
 */
public class Solution_0860Test {

    Solution_0860 solution;

    @Before
    public void init() {
        solution = new Solution_0860();
    }

    @Test
    public void test1() {
        int[] bills = {5, 5, 5, 10, 20};
        Assert.assertEquals(true, solution.lemonadeChange(bills));
    }

    @Test
    public void test2() {
        int[] bills = {5, 5, 10};
        Assert.assertEquals(true, solution.lemonadeChange(bills));
    }

    @Test
    public void test3() {
        int[] bills = {10, 10};
        Assert.assertEquals(false, solution.lemonadeChange(bills));
    }

    @Test
    public void test4() {
        int[] bills = {5, 5, 10, 10, 20};
        Assert.assertEquals(false, solution.lemonadeChange(bills));
    }
}
