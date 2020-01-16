package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0328Test {

    Solution_0328 solution_0328;

    @Before
    public void init() {
        solution_0328 = new Solution_0328();
    }

    @Test
    public void oddEvenListTest1() {
        ListNode head = ListNodeBuilder.build("1->2->3->4->5");
        ListNode newHead = solution_0328.oddEvenList(head);
        newHead.display();
        Assert.assertEquals(1, head.val);
        Assert.assertEquals(3, head.next.val);
        Assert.assertEquals(5, head.next.next.val);
        Assert.assertEquals(2, head.next.next.next.val);
        Assert.assertEquals(4, head.next.next.next.next.val);
    }

    @Test
    public void oddEvenListTest2() {
        ListNode head = ListNodeBuilder.build("2->1->3->5->6->4->7");
        ListNode newHead = solution_0328.oddEvenList(head);
        newHead.display();
        Assert.assertEquals(2, head.val);
        Assert.assertEquals(3, head.next.val);
        Assert.assertEquals(6, head.next.next.val);
        Assert.assertEquals(7, head.next.next.next.val);
        Assert.assertEquals(1, head.next.next.next.next.val);
        Assert.assertEquals(5, head.next.next.next.next.next.val);
        Assert.assertEquals(4, head.next.next.next.next.next.next.val);
    }
}
