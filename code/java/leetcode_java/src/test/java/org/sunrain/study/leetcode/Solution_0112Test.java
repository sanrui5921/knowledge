package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0112Test {

    Solution_0112 solution;

    /**
     * 5
     * / \
     * 4   8
     * /   / \
     * 11  13  4
     * /  \      \
     * 7    2      1
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/path-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    @Before
    public void init() {
        solution = new Solution_0112();
    }

    @Test
    public void hasPathSumTest1() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(1);
        preOrderInner(node);
        Assert.assertEquals(true, solution.hasPathSum(node, 22));
    }

    @Test
    public void hasPathSumTest2() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        Assert.assertEquals(false, solution.hasPathSum(node, 1));
    }

    @Test
    public void hasPathSumTest3() {
        Assert.assertEquals(false, solution.hasPathSum(null, 0));
    }

    @Test
    public void hasPathSumTest4() {
        TreeNode node = new TreeNode(1);
        Assert.assertEquals(false, solution.hasPathSum(node, 0));
    }

    private void preOrderInner(TreeNode current) {
        if (current != null) {
            System.out.print(current.val + " ");
            preOrderInner(current.left);
            preOrderInner(current.right);
        }
    }
}
