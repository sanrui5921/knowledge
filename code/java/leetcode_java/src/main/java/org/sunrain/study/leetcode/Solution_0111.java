package org.sunrain.study.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最小深度  2.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int level = 1;

        Queue queue = new LinkedList();

        queue.offer(new MyTreeNode(root, 1));

        MyTreeNode current;

        while (!queue.isEmpty()) {
            current = (MyTreeNode) queue.poll();
            if (current.node.left == null && current.node.right == null) {
                level = current.level;
                break;
            }
            if (current.node.left != null) {
                queue.offer(new MyTreeNode(current.node.left,  current.level + 1));
            }

            if (current.node.right != null) {
                queue.offer(new MyTreeNode(current.node.right,  current.level + 1));
            }
        }

        return level;
    }

    class MyTreeNode {

        int level;

        TreeNode node;

        MyTreeNode(TreeNode node, int level) {
            this.level = level;
            this.node = node;
        }
    }
}
