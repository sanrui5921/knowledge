package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0061Test {

    Solution_0061 solution_0061;

    @Before
    public void init() {
        solution_0061 = new Solution_0061();
    }

    @Test
    public void rotateRightTest1() {
        ListNode head = ListNodeBuilder.build("1->2->3->4->5");
        ListNode newHead = solution_0061.rotateRight(head, 2);
        //4->5->1->2->3->NULL
        Assert.assertEquals(4, newHead.val);
        Assert.assertEquals(5, newHead.next.val);
        Assert.assertEquals(1, newHead.next.next.val);
        Assert.assertEquals(2, newHead.next.next.next.val);
        Assert.assertEquals(3, newHead.next.next.next.next.val);
        Assert.assertEquals(null, newHead.next.next.next.next.next);
    }

    @Test
    public void rotateRightTest2() {
        ListNode head = ListNodeBuilder.build("0->1->2");
        ListNode newHead = solution_0061.rotateRight(head, 4);
        //2->0->1
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(0, newHead.next.val);
        Assert.assertEquals(1, newHead.next.next.val);
        Assert.assertEquals(null, newHead.next.next.next);
    }
}
