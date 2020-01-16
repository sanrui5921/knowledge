package org.sunrain.study.leetcode;


import java.util.Stack;

/**
 * 给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 进阶:
 * <p>
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 * <p>
 * 示例:
 * <p>
 * 输入: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出: 7 -> 8 -> 0 -> 7
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        pushData(stack1, l1);
        pushData(stack2, l2);

        int reminder = 0;

        ListNode newHead = null;

        while (!stack1.isEmpty() || !stack2.isEmpty()) {

            int value1 = 0;

            int value2 = 0;

            if (!stack1.isEmpty()) {
                value1 = ((ListNode) stack1.pop()).val;
            }

            if (!stack2.isEmpty()) {
                value2 = ((ListNode) stack2.pop()).val;
            }

            ListNode current = new ListNode((value1 + value2 + reminder) % 10);
            if (newHead == null) {
                newHead = current;
            } else {
                current.next = newHead;
                newHead = current;
            }

            reminder = (value1 + value2 + reminder) / 10;
        }

        if (reminder != 0) {
            ListNode current = new ListNode(reminder);
            current.next = newHead;
            newHead = current;
        }

        return newHead;
    }

    public void pushData(Stack stack, ListNode l) {
        if (l == null) {
            return;
        }

        for (ListNode current = l; current != null; current = current.next) {
            stack.push(current);
        }
    }
}
