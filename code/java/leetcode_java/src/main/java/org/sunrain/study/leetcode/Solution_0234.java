package org.sunrain.study.leetcode;


/**
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class Solution_0234 {

    public boolean isPalindrome(ListNode head) {

        ListNode temp = head;

        int number = 0;
        for (; temp != null; temp = temp.next) {
            number++;
        }

        ListNode newHead = reverseList(head, number / 2 - 1);

        temp = newHead;

        int times = 0;
        for (; times < number / 2; times++) {
            temp = temp.next;
        }

        if (number % 2 != 0 && temp.next != null) {
            temp = temp.next;
        }

        ListNode tempNext = temp.next;
        temp = newHead;

        for (; times < number; times++) {
            if (temp.val != tempNext.val) {
                return false;
            }
        }

        return true;
    }

    public ListNode reverseList(ListNode head, int number) {
        ListNode newHead = head;
        ListNode next = head.next;
        int times = 0;
        while (next != null && times < number) {
            head.next = next.next;
            next.next = newHead;
            newHead = next;
            next = head.next;
            times++;
        }
        return newHead;
    }
}
