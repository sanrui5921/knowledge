package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0747Test {

    Solution_0747 solution;

    @Before
    public void init() {
        solution = new Solution_0747();
    }

    @Test
    public void test1() {
        int[] array = {3, 6, 1, 0};
        Assert.assertEquals(1, solution.dominantIndex(array));
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 3, 4};
        Assert.assertEquals(-1, solution.dominantIndex(array));
    }

    @Test
    public void test3() {
        int[] array = {0, 0, 0, 1};
        Assert.assertEquals(3, solution.dominantIndex(array));
    }
}
