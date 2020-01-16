package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_1171Test {

    Solution_1171 solution;

    @Before
    public void init() {
        solution = new Solution_1171();
    }

    @Test
    public void test1() {
        ListNode head = ListNodeBuilder.build("1->2->-3->3->1");
        ListNode result = solution.removeZeroSumSublists(head);
        Assert.assertEquals("3->1", result.show());
    }

    @Test
    public void test2() {
        ListNode head = ListNodeBuilder.build("1->2->3->-3->4");
        ListNode result = solution.removeZeroSumSublists(head);
        Assert.assertEquals("1->2->4", result.show());
    }

    @Test
    public void test3() {
        ListNode head = ListNodeBuilder.build("-1->1");
        ListNode result = solution.removeZeroSumSublists(head);
        Assert.assertEquals(null, result);
    }

    @Test
    public void test4() {
        ListNode head = ListNodeBuilder.build("0");
        ListNode result = solution.removeZeroSumSublists(head);
        Assert.assertEquals(null, result);
    }

    @Test
    public void test5() {
        ListNode head = ListNodeBuilder.build("0->0");
        ListNode result = solution.removeZeroSumSublists(head);
        Assert.assertEquals(null, result);
    }
}
