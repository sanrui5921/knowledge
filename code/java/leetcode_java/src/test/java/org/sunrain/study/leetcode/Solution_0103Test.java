package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.TreeBuilder;

import java.util.List;

public class Solution_0103Test {

    Solution_0103 solution;

    @Before
    public void init() {
        solution = new Solution_0103();
    }

    @Test
    public void levelOrderTest1() {
        //[3],
        // * [20,9],
        // * [15,7]
        Integer[] array = {3, 9, 20, null, null, 15, 7};

        TreeNode node = TreeBuilder.build(array);

        List<List<Integer>> lists = solution.zigzagLevelOrder(node);

        Assert.assertEquals(3, lists.size());

        Assert.assertEquals(1, lists.get(0).size());
        Assert.assertEquals(new Integer(3), (Integer) lists.get(0).get(0));

        Assert.assertEquals(2, lists.get(1).size());
        Assert.assertEquals(new Integer(20), (Integer) lists.get(1).get(0));
        Assert.assertEquals(new Integer(9), (Integer) lists.get(1).get(1));

        Assert.assertEquals(2, lists.get(2).size());
        Assert.assertEquals(new Integer(15), (Integer) lists.get(2).get(0));
        Assert.assertEquals(new Integer(7), (Integer) lists.get(2).get(1));
    }

    @Test
    public void levelOrderTest2() {
        //[1],
        // * [3, 2],
        // * [4, 5]
        Integer[] array = {1, 2, 3, 4, null, null, 5};

        TreeNode node = TreeBuilder.build(array);

        List<List<Integer>> lists = solution.zigzagLevelOrder(node);

        Assert.assertEquals(3, lists.size());

        Assert.assertEquals(1, lists.get(0).size());
        Assert.assertEquals(new Integer(1), (Integer) lists.get(0).get(0));

        Assert.assertEquals(2, lists.get(1).size());
        Assert.assertEquals(new Integer(3), (Integer) lists.get(1).get(0));
        Assert.assertEquals(new Integer(2), (Integer) lists.get(1).get(1));

        Assert.assertEquals(2, lists.get(2).size());
        Assert.assertEquals(new Integer(4), (Integer) lists.get(2).get(0));
        Assert.assertEquals(new Integer(5), (Integer) lists.get(2).get(1));
    }

}
