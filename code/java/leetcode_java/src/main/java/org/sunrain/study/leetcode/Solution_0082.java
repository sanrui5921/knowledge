package org.sunrain.study.leetcode;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 * <p>
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0082 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = new ListNode(0);
        ListNode parent = result;
        parent.next = head;

        for (ListNode current = head; current != null; ) {
            boolean duplicate = false;
            ListNode inCurrent = current.next;
            while (inCurrent != null) {
                if (inCurrent.val == current.val) {
                    duplicate = true;
                    current.next = inCurrent.next;
                    inCurrent = current.next;
                    continue;
                }
                break;
            }

            if (duplicate) {
                parent.next = current.next;
                current = parent.next;
            } else {
                current = current.next;
                parent = parent.next;
            }
        }
        return result.next;
    }
}
