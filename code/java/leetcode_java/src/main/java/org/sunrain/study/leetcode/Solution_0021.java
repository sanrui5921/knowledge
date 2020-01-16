package org.sunrain.study.leetcode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);

        ListNode resultCurrent = result;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                resultCurrent.next = l1;
                l1 = l1.next;
            } else {
                resultCurrent.next = l2;
                l2 = l2.next;
            }
            resultCurrent = resultCurrent.next;
            resultCurrent.next = null;
        }

        if (l1 != null && l2 == null) {
            resultCurrent.next = l1;
        }

        if (l1 == null && l2 != null) {
            resultCurrent.next = l2;
        }

        return result.next;
    }
}
