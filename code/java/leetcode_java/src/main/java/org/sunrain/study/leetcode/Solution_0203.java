package org.sunrain.study.leetcode;

/**
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class Solution_0203 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode newListHead = new ListNode(0);

        ListNode parent = newListHead;

        parent.next = head;

        for (ListNode current = head; current != null; ) {
            if (current.val == val) {
                parent.next = current.next;
            } else {
                parent = parent.next;
            }
            current = parent.next;
        }

        return newListHead.next;
    }
}
