package org.sunrain.study.leetcode;


/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * 示例 2:
 * <p>
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 * 说明:
 * <p>
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/odd-even-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = null;

        ListNode oddCurrent = null;

        ListNode evenHead = null;

        ListNode evenCurrent = null;

        int i = 1;

        for (ListNode current = head; current != null; i++) {
            ListNode next = current.next;
            if (i % 2 == 0) {
                if (evenCurrent == null) {
                    evenHead = current;
                    evenCurrent = evenHead;
                } else {
                    evenCurrent.next = current;
                    evenCurrent = current;
                }
                evenCurrent.next = null;
            } else {
                if (oddCurrent == null) {
                    oddHead = current;
                    oddCurrent = oddHead;
                } else {
                    oddCurrent.next = current;
                    oddCurrent = current;
                }
                oddCurrent.next = null;
            }
            current = next;
        }

        oddCurrent.next = evenHead;

        return oddHead;
    }
}
