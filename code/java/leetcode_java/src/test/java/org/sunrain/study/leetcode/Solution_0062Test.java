package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/7.
 */
public class Solution_0062Test {

    Solution_0062 solution;

    @Before
    public void init() {
        solution = new Solution_0062();
    }

    @Test
    public void uniquePathsTest1() {
        Assert.assertEquals(3, solution.uniquePaths(3, 2));
        Assert.assertEquals(28, solution.uniquePaths(7, 3));
    }
}
