package org.sunrain.study.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其自底向上的层次遍历为：
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution_0107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        int height = maxDepth(root);

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            list.add(new ArrayList<>());
        }

        process(list, root, height - 1);

        return list;
    }

    private void process(List<List<Integer>> list, TreeNode root, int level) {

        if (root == null) {
            return;
        }

        list.get(level).add(root.val);

        process(list, root.left, level - 1);

        process(list, root.right, level - 1);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left) + 1;
        int r = maxDepth(root.right) + 1;
        return l > r ? l : r;
    }
}
