package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/16.
 */
public class Solution_0063Test {

    Solution_0063 solution;

    @Before
    public void init() {
        this.solution = new Solution_0063();
    }

    @Test
    public void uniquePathsWithObstaclesTest1() {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        Assert.assertEquals(2, solution.uniquePathsWithObstacles(matrix));
    }
}
