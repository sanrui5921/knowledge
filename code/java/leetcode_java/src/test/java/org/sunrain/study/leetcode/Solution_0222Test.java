package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.TreeBuilder;

public class Solution_0222Test {

    Solution_0222 solution;

    @Before
    public void init() {
        solution = new Solution_0222();
    }

    @Test
    public void countNodesTest1() {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        TreeNode node = TreeBuilder.build(array);
        Assert.assertEquals(6, solution.countNodes(node));
    }
}
