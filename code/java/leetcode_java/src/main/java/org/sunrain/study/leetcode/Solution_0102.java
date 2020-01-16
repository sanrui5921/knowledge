package org.sunrain.study.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution_0102 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> list = new ArrayList<>();

        add(list, root, 0);

        return list;
    }

    public void add(List<List<Integer>> lists, TreeNode node, int level) {

        if (lists.size() <= level) {
            List<Integer> list = new ArrayList<>();
            lists.add(level, list);
        }

        lists.get(level).add(node.val);
        if (node.left != null) {
            add(lists, node.left, level + 1);
        }

        if (node.right != null) {
            add(lists, node.right, level + 1);
        }
    }
}
