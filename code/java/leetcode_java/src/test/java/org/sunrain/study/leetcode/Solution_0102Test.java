package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.TreeBuilder;

import java.util.List;

public class Solution_0102Test {

    Solution_0102 solution_0102;

    @Before
    public void init() {
        solution_0102 = new Solution_0102();
    }

    @Test
    public void levelOrderTest1() {
        //[3],
        // * [9,20],
        // * [15,7]
        Integer[] array = {3, 9, 20, null, null, 15, 7};

        TreeNode node = TreeBuilder.build(array);

        List<List<Integer>> lists = solution_0102.levelOrder(node);

        Assert.assertEquals(3, lists.size());

        Assert.assertEquals(1, lists.get(0).size());
        Assert.assertEquals(new Integer(3), (Integer) lists.get(0).get(0));

        Assert.assertEquals(2, lists.get(1).size());
        Assert.assertEquals(new Integer(9), (Integer) lists.get(1).get(0));
        Assert.assertEquals(new Integer(20), (Integer) lists.get(1).get(1));

        Assert.assertEquals(2, lists.get(2).size());
        Assert.assertEquals(new Integer(15), (Integer) lists.get(2).get(0));
        Assert.assertEquals(new Integer(7), (Integer) lists.get(2).get(1));
    }
}
