package org.sunrain.study.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.TreeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Solution_0144Test {

    Solution_0144 solution;

    @Before
    public void init() {
        solution = new Solution_0144();
    }

    @Test
    public void preorderTraversalTest1() {
        Integer[] array = {1, null, 2, null, null, 3};
        TreeNode node = TreeBuilder.build(array);
        List<Integer> result = solution.preorderTraversal(node);
        System.out.println(result);
    }

    @Test
    public void preorderTraversalTest2() {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        List<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(3);
        list.add(15);
        list.add(20);
        list.add(7);
        List<Integer> result = solution.preorderTraversal(node);
        System.out.println(result);
    }
}
