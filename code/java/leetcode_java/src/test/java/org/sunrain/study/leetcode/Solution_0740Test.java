package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0740Test {

    Solution_0740 solution;

    @Before
    public void init() {
        solution = new Solution_0740();
    }

    @Test
    public void test1() {
        int[] array = {3, 4, 2};
        Assert.assertEquals(6, solution.deleteAndEarn(array));
    }

    @Test
    public void test2() {
        int[] array = {2, 2, 3, 3, 3, 4};
        Assert.assertEquals(9, solution.deleteAndEarn(array));
    }
}
