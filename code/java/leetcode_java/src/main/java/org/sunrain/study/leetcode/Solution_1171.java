package org.sunrain.study.leetcode;

/**
 * 难度: 中等
 * 标签: 链表
 * <p>
 * 给你一个链表的头节点 head，请你编写代码，反复删去链表中由 总和 值为 0 的连续节点组成的序列，直到不存在这样的序列为止。
 * <p>
 * 删除完毕后，请你返回最终结果链表的头节点。
 * <p>
 * 你可以返回任何满足题目要求的答案。
 * <p>
 * （注意，下面示例中的所有序列，都是对 ListNode 对象序列化的表示。）
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,2,-3,3,1]
 * 输出：[3,1]
 * 提示：答案 [1,2,1] 也是正确的。
 * 示例 2：
 * <p>
 * 输入：head = [1,2,3,-3,4]
 * 输出：[1,2,4]
 * 示例 3：
 * <p>
 * 输入：head = [1,2,3,-3,-2]
 * 输出：[1]
 *  
 * <p>
 * 提示：
 * <p>
 * 给你的链表中可能有 1 到 1000 个节点。
 * 对于链表中的每个节点，节点的值：-1000 <= node.val <= 1000.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_1171 {
    public ListNode removeZeroSumSublists(ListNode head) {

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode parent = newHead;

        for (ListNode current = parent.next; current != null; ) {

            if (current.val == 0) {
                parent.next = current.next;
                if (parent == null) {
                    break;
                } else {
                    current = parent.next;
                }
            } else {
                int value = current.val;
                ListNode next = current.next;
                for (; next != null; next = next.next) {
                    value = next.val + value;
                    if (value == 0) {
                        break;
                    }
                }

                if (value == 0) {
                    parent.next = next.next;
                    current = parent != null ? parent.next : null;
                } else {
                    parent = parent.next;
                    current = parent != null ? parent.next : null;
                }
            }
        }

        return newHead.next;
    }
}
