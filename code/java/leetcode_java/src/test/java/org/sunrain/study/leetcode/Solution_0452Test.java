package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/18.
 */
public class Solution_0452Test {

    Solution_0452 solution;

    @Before
    public void init() {
        solution = new Solution_0452();
    }

    @Test
    public void test1() {
        //[[10,16], [2,8], [1,6], [7,12]]
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        Assert.assertEquals(2, solution.findMinArrowShots(points));
    }
}
