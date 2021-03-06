package org.sunrain.study.leetcode;


/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = head;
        ListNode second = head;

        for (int i = 1; i <= n; i++) {
            second = second.next;
        }

        if (second == null) {
            head = head.next;
            return head;
        }

        while (second.next != null) {
            second = second.next;
            first = first.next;
        }

        if (first.next != null) {
            first.next = first.next.next;
        }

        return head;
    }
}
