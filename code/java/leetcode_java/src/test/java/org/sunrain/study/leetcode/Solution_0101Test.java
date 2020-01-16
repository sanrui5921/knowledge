package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.TreeBuilder;

public class Solution_0101Test {

    Solution_0101 solution;

    @Before
    public void init() {
        solution = new Solution_0101();
    }

    @Test
    public void isSymmetricTest1() {
        Integer[] array = {1, 2, 2, 3, 4, 4, 3};
        TreeNode node = TreeBuilder.build(array);
        Assert.assertEquals(true, solution.isSymmetric(node));
    }

    @Test
    public void isSymmetricTest2() {
        Integer[] array = {1, 2, 2, null, 3, null, 3};
        TreeNode node = TreeBuilder.build(array);
        Assert.assertEquals(false, solution.isSymmetric(node));
    }
}
