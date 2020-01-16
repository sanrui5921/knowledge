package org.sunrain.study.leetcode;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void display() {
        ListNode temp = this;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public String show() {
        StringBuilder builder = new StringBuilder();
        ListNode temp = this;
        while (temp != null) {
            builder.append(temp.val);
            if (temp.next != null) {
                builder.append("->");
            }
            temp = temp.next;
        }
        return builder.toString();
    }
}
