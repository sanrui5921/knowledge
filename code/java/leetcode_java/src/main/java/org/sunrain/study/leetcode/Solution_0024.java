package org.sunrain.study.leetcode;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 示例:
 * <p>
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0024 {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = new ListNode(0);

        first.next = head;

        int i = 0;

        while (true) {
            ListNode second = first.next;
            if (second == null) {
                break;
            }
            ListNode third = second.next;
            if (third == null) {
                break;
            }
            swapThreeNodes(first, second, third);
            if (i == 0) {
                head = first;
            }
            first = second;
            i++;
        }

        return head.next;
    }

    public void swapThreeNodes(ListNode first, ListNode second, ListNode third) {
        second.next = third.next;
        third.next = second;
        first.next = third;
    }
}
