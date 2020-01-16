package org.sunrain.study.leetcode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode parent = result;
        parent.next = head;

        for (ListNode current = head; current != null; ) {
            ListNode inCurrent = current.next;
            while (inCurrent != null) {
                if (inCurrent.val == current.val) {
                    current.next = inCurrent.next;
                    inCurrent = current.next;
                    continue;
                }
                break;
            }

            current = current.next;
            parent = parent.next;
        }
        return result.next;
    }
}
