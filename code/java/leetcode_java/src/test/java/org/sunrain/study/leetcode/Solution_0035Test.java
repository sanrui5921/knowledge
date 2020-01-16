package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0035Test {

    Solution_0035 solution;

    @Before
    public void init() {
        solution = new Solution_0035();
    }

    @Test
    public void searchInsertTest1() {
        int[] array = {1, 3, 5, 6};
        Assert.assertEquals(2, solution.searchInsert1(array, 5));
    }

    @Test
    public void searchInsertTest2() {
        int[] array = {1, 3, 5, 6};
        Assert.assertEquals(1, solution.searchInsert1(array, 2));
    }

    @Test
    public void searchInsertTest3() {
        int[] array = {1, 3, 5, 6};
        Assert.assertEquals(4, solution.searchInsert1(array, 7));
    }

    @Test
    public void searchInsertTest4() {
        int[] array = {1, 3, 5, 6};
        Assert.assertEquals(0, solution.searchInsert1(array, 0));
    }
}
