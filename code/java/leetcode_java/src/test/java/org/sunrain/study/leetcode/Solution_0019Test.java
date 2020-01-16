package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0019Test {

    Solution_0019 solution;

    @Before
    public void init() {
        solution = new Solution_0019();
    }

    @Test
    public void removeNthFromEndTest1() {
        String s = "1->2->3->4->5";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.removeNthFromEnd(node, 2);
        newHead.display();
    }

    @Test
    public void removeNthFromEndTest2() {
        String s = "1";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.removeNthFromEnd(node, 1);
        Assert.assertEquals(null, newHead);
    }

    @Test
    public void removeNthFromEndTest3() {
        String s = "1->2";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.removeNthFromEnd(node, 1);
        newHead.display();
    }

    @Test
    public void removeNthFromEndTest4() {
        String s = "1->2";
        ListNode node = ListNodeBuilder.build(s);
        ListNode newHead = solution.removeNthFromEnd(node, 2);
        newHead.display();
    }
}
