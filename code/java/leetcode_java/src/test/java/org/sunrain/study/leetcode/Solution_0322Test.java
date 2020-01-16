package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0322Test {

    Solution_0322 solution;

    @Before
    public void init() {
        solution = new Solution_0322();
    }

    @Test
    public void test1() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        Assert.assertEquals(3, solution.coinChange(coins, amount));
    }

    @Test
    public void test2() {
        int[] coins = {2};
        int amount = 3;
        Assert.assertEquals(-1, solution.coinChange(coins, amount));
    }

    @Test
    public void test3() {
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        Assert.assertEquals(20, solution.coinChange(coins, amount));
    }
}
