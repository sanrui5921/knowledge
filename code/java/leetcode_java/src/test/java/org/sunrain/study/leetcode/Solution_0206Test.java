package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0206Test {

    private Solution_0206 solution;

    @Before
    public void init() {
        solution = new Solution_0206();
    }

    @Test
    public void reverseListTest() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        solution.display(head);

        ListNode newHead = solution.reverseList(head);

        solution.display(newHead);

        Assert.assertEquals(5, newHead.val);
    }

    @Test
    public void reverseListTest1() {

        ListNode head = new ListNode(1);

        ListNode newHead = solution.reverseList(head);

        solution.display(newHead);

        Assert.assertEquals(1, newHead.val);
    }
}
