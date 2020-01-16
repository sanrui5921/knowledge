package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.TreeBuilder;

public class Solution_0111Test {

    Solution_0111 solution;

    @Before
    public void init() {
        solution = new Solution_0111();
    }

    @Test
    public void minDepthTest1() {
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeBuilder.build(array);
        Assert.assertEquals(2, solution.minDepth(root));
    }

    @Test
    public void minDepthTest2() {
        Integer[] array = {1, 2, 3, 4, null, null, 5};
        TreeNode root = TreeBuilder.build(array);
        Assert.assertEquals(3, solution.minDepth(root));
    }
}
