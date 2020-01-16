package org.sunrain.study.leetcode;

/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * <p>
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0092 {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode mNode = new ListNode(0);

        ListNode newHead = mNode;

        ListNode nNode = mNode;

        mNode.next = head;

        for (int i = 1; i <= n; i++) {
            if (i < m) {
                mNode = mNode.next;
                nNode = nNode.next;
                continue;
            }
            nNode = nNode.next;
        }

        ListNode ahead = mNode;
        mNode = ahead.next;
        ListNode after = null;
        if (nNode != null) {
            after = nNode.next;
        }
        nNode.next = null;

        mNode = reverseList(mNode);

        ahead.next = mNode;

        while (mNode.next != null) {
            mNode = mNode.next;
        }

        mNode.next = after;

        return m != 1 ? newHead.next : ahead.next;
    }

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
}
