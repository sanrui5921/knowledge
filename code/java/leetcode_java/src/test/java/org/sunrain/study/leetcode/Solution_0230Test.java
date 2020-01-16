package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.TreeBuilder;

public class Solution_0230Test {

    Solution_0230 solution;

    @Before
    public void init() {
        solution = new Solution_0230();
    }

    @Test
    public void test1() {
        Integer[] array = {3, 1, 4, null, 2};
        TreeNode root = TreeBuilder.build(array);
        Assert.assertEquals(1, solution.kthSmallest(root, 1));
    }

    @Test
    public void test2() {
        Integer[] array = {5, 3, 6, 2, 4, null, null, 1};
        TreeNode root = TreeBuilder.build(array);
        Assert.assertEquals(3, solution.kthSmallest(root, 3));
    }
}
