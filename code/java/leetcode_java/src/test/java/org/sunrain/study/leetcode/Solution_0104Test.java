package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0104Test {

    Solution_0104 solution;

    @Before
    public void init() {
        solution = new Solution_0104();
    }

    @Test
    public void maxDepthTest1() {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        Assert.assertEquals(3, solution.maxDepth(node));
    }
}
