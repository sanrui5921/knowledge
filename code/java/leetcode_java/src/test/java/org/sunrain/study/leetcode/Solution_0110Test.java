package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.TreeBuilder;

public class Solution_0110Test {

    Solution_0110 solution;

    @Before
    public void init() {
        solution = new Solution_0110();
    }

    @Test
    public void isBalancedTest1() {
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        TreeNode node = TreeBuilder.build(array);
        Assert.assertEquals(true, solution.isBalanced(node));
    }

    @Test
    public void isBalancedTest2() {
        Integer[] array = {1, 2, 2, 3, 3, null, null, 4, 4};
        TreeNode node = TreeBuilder.build(array);
        Assert.assertEquals(false, solution.isBalanced(node));
    }

    @Test
    public void isBalancedTest3() {
        Integer[] array = {1, 2, 2, 3, null, null, 3, 4, null, null, null, null, 4};
        TreeNode node = TreeBuilder.build(array);
        Assert.assertEquals(false, solution.isBalanced(node));
    }
}
