package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0334Test {

    Solution_0334 solution;

    @Before
    public void init() {
        solution = new Solution_0334();
    }

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4, 5};
        Assert.assertEquals(true, solution.increasingTriplet(array));
    }

    @Test
    public void test2() {
        int[] array = {5, 4, 3, 2, 1};
        Assert.assertEquals(false, solution.increasingTriplet(array));
    }

    @Test
    public void test3() {
        int[] array = {1, 3, 2, 5, 4};
        Assert.assertEquals(true, solution.increasingTriplet(array));
    }

    @Test
    public void test4() {
        int[] array = {2, 1, 5, 0, 3};
        Assert.assertEquals(false, solution.increasingTriplet(array));
    }
}
