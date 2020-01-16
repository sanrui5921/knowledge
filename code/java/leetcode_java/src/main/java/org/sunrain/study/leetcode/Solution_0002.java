package org.sunrain.study.leetcode;

/**
 * 难度: 中等
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution_0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, curr = resultHead;
        int last = 0;
        while (p1 != null || p2 != null) {
            int p1Value = p1 == null ? 0 : p1.val;
            int p2Value = p2 == null ? 0 : p2.val;
            curr.next = new ListNode((p1Value + p2Value + last) % 10);
            last = (p1Value + p2Value + last) / 10;
            curr = curr.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if (last > 0) {
            curr.next = new ListNode(last);
        }

        return resultHead.next;
    }

//    public static void main(String[] args) throws CloneNotSupportedException {
//        ListNode l1 = new ListNode(2);
//        ListNode l11 = new ListNode(4);
//        l1.next = l11;
//
//        ListNode l2 = (ListNode) l1.clone();
//
//        System.out.println(ToStringBuilder.reflectionToString(l1));
//        System.out.println(ToStringBuilder.reflectionToString(l2));
//    }
}
