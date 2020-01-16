package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0011Test {

    Solution_0011 solution;

    @Before
    public void init() {
        solution = new Solution_0011();
    }

    @Test
    public void maxAreaTest1() {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(49, solution.maxArea(array));
    }

    @Test
    public void maxArea1Test1() {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(49, solution.maxArea1(array));
    }
}
