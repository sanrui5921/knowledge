package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListBuilder;

import java.util.List;

/**
 * Created by qichao on 2019/11/16.
 */
public class Solution_0120Test {

    Solution_0120 solution;

    @Before
    public void init() {
        solution = new Solution_0120();
    }

    @Test
    public void minimumTotalTest1() {
        int[][] matrix = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
        List<List<Integer>> lists = ListBuilder.build(matrix);
        Assert.assertEquals(11, solution.minimumTotal(lists));
    }
}
