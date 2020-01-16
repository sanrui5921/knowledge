package org.sunrain.study.utils;

import org.sunrain.study.leetcode.TreeNode;

/**
 * Created by qichao on 2019/11/7.
 */
public class TreeBuilder {


    public static TreeNode build(Integer[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        return build(array, 0, 1);

    }

    private static TreeNode build(Integer[] array, int index, int level) {

        if (index >= array.length) {
            return null;
        }

        if (array[index] == null) {
            return null;
        }

        TreeNode node = new TreeNode(array[index]);

        node.left = build(array, index * 2 + 1, level + 1);

        node.right = build(array, index * 2 + 2, level + 1);

        return node;
    }

    //前序遍历:根节点——》左子树——》右子树
    private static void preOrderInner(TreeNode current) {
        if (current != null) {
            System.out.print(current.val + " ");
            preOrderInner(current.left);
            preOrderInner(current.right);
        }
    }

    //中序遍历:左子树——》根节点——》右子树
    private static void infixOrderInner(TreeNode current) {
        if (current != null) {
            infixOrderInner(current.left);
            System.out.print(current.val + " ");
            infixOrderInner(current.right);
        }
    }

    //后序遍历:左子树——》右子树——》根节点
    private static void postOrderInner(TreeNode current) {
        if (current != null) {
            postOrderInner(current.left);
            postOrderInner(current.right);
            System.out.print(current.val + " ");
        }
    }

    public static void main(String[] args) {

        Integer[] array = {1, 2, 2, 3, 3, null, null, 4, 4};

        TreeNode node = build(array);

        preOrderInner(node);
    }
}
