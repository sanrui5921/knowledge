package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0024Test {

    Solution_0024 solution;

    @Before
    public void init() {
        solution = new Solution_0024();
    }

    @Test
    public void swapPairsTest1() {
        ListNode head = ListNodeBuilder.build("1->2->3->4");
        head.display();
        ListNode newHead = solution.swapPairs(head);
        newHead.display();
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(1, newHead.next.val);
        Assert.assertEquals(4, newHead.next.next.val);
        Assert.assertEquals(3, newHead.next.next.next.val);
    }

    @Test
    public void swapPairsTest2() {
        ListNode head = ListNodeBuilder.build("1->2");
        head.display();
        ListNode newHead = solution.swapPairs(head);
        newHead.display();
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(1, newHead.next.val);
        Assert.assertEquals(null, newHead.next.next);
    }

    @Test
    public void swapPairsTest3() {
        ListNode head = ListNodeBuilder.build("1");
        head.display();
        ListNode newHead = solution.swapPairs(head);
        newHead.display();
        Assert.assertEquals(1, newHead.val);
        Assert.assertEquals(null, newHead.next);
    }
}
