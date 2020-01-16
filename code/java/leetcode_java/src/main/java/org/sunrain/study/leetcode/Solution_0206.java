package org.sunrain.study.leetcode;


/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */

public class Solution_0206 {

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode newHead = head;

        ListNode next = head.next;

        while (next != null) {

            head.next = next.next;
            next.next = newHead;
            newHead = next;
            next = head.next;

        }

        return newHead;
    }

    public void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}