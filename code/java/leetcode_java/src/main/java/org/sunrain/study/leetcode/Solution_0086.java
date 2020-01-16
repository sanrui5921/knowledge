package org.sunrain.study.leetcode;

/**
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * <p>
 * 你应当保留两个分区中每个节点的初始相对位置。
 * <p>
 * 示例:
 * <p>
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0086 {

    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode leftHead = null;
        ListNode leftCurrent = null;
        ListNode rightHead = null;
        ListNode rightCurrent = null;

        for (ListNode current = head; current != null; current = current.next) {
            if (current.val < x) {
                if (leftHead == null) {
                    leftHead = new ListNode(current.val);
                    leftCurrent = leftHead;
                    continue;
                }
                leftCurrent.next = new ListNode(current.val);
                leftCurrent = leftCurrent.next;
            } else {
                if (rightHead == null) {
                    rightHead = new ListNode(current.val);
                    rightCurrent = rightHead;
                    continue;
                }
                rightCurrent.next = new ListNode(current.val);
                rightCurrent = rightCurrent.next;
            }
        }

        if (leftCurrent != null) {
            leftCurrent.next = rightHead;
        }

        head = leftHead != null ? leftHead : rightHead;

        return head;
    }
}
