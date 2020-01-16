package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0234Test {

    private Solution_0234 solution;

    @Before
    public void init() {
        solution = new Solution_0234();
    }

    @Test
    public void isPalindromeTest() {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Assert.assertEquals(true, solution.isPalindrome(head));
    }

    @Test
    public void isPalindromeTest2() {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        head.next = node1;
        node1.next = node3;
        node3.next = node4;

        Assert.assertEquals(false, solution.isPalindrome(head));
    }

    @Test
    public void isPalindromeTest3() {

        ListNode head = new ListNode(1);

        Assert.assertEquals(true, solution.isPalindrome(head));
    }

    @Test
    public void isPalindromeTest4() {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);

        head.next = node1;
        Assert.assertEquals(false, solution.isPalindrome(head));
    }

    @Test
    public void isPalindromeTest5() {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);

        head.next = node1;
        Assert.assertEquals(false, solution.isPalindrome(head));
    }
}
