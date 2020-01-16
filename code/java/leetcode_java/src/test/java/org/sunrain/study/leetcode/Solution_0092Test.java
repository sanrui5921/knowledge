package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0092Test {

    Solution_0092 solution;

    @Before
    public void init() {
        solution = new Solution_0092();
    }

    @Test
    public void reverseBetweenTest1() {
        String s = "1->2->3";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.reverseBetween(node, 1, 3);
        newHead.display();
        Assert.assertEquals(3, newHead.val);
        Assert.assertEquals(2, newHead.next.val);
        Assert.assertEquals(1, newHead.next.next.val);
        Assert.assertEquals(null, newHead.next.next.next);
    }

    @Test
    public void reverseBetweenTest2() {
        String s = "1->2->3->4->5";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.reverseBetween(node, 1, 3);
        newHead.display();
        Assert.assertEquals(3, newHead.val);
        Assert.assertEquals(2, newHead.next.val);
        Assert.assertEquals(1, newHead.next.next.val);
        Assert.assertEquals(4, newHead.next.next.next.val);
        Assert.assertEquals(5, newHead.next.next.next.next.val);
        Assert.assertEquals(null, newHead.next.next.next.next.next);
    }

    @Test
    public void reverseBetweenTest3() {
        String s = "1->2";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.reverseBetween(node, 1, 2);
        newHead.display();
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(1, newHead.next.val);
        Assert.assertEquals(null, newHead.next.next);
    }

    @Test
    public void reverseBetweenTest4() {
        String s = "1->2";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.reverseBetween(node, 1, 1);
        newHead.display();
        Assert.assertEquals(1, newHead.val);
        Assert.assertEquals(2, newHead.next.val);
        Assert.assertEquals(null, newHead.next.next);
    }

    @Test
    public void reverseBetweenTest5() {
        String s = "1->2->3->4->5";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.reverseBetween(node, 2, 4);
        newHead.display();
        Assert.assertEquals(1, newHead.val);
        Assert.assertEquals(4, newHead.next.val);
        Assert.assertEquals(3, newHead.next.next.val);
        Assert.assertEquals(2, newHead.next.next.next.val);
        Assert.assertEquals(5, newHead.next.next.next.next.val);
        Assert.assertEquals(null, newHead.next.next.next.next.next);
    }
}
