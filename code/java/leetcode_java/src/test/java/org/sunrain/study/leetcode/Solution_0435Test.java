package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/18.
 */
public class Solution_0435Test {

    Solution_0435 solution;

    @Before
    public void init() {
        solution = new Solution_0435();
    }

    @Test
    public void test1() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        Assert.assertEquals(1, solution.eraseOverlapIntervals(intervals));
    }

    @Test
    public void test2() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        Assert.assertEquals(2, solution.eraseOverlapIntervals(intervals));
    }

    @Test
    public void test3() {
        int[][] intervals = {{1, 2}, {2, 3}};
        Assert.assertEquals(0, solution.eraseOverlapIntervals(intervals));
    }

    @Test
    public void test4() {
        int[][] intervals = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        Assert.assertEquals(2, solution.eraseOverlapIntervals(intervals));
    }
}

