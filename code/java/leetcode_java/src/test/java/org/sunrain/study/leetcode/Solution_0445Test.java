package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0445Test {

    Solution_0445 solution_0445;

    @Before
    public void init() {
        solution_0445 = new Solution_0445();
    }

    @Test
    public void addTwoNumbersTest1() {
        ListNode l1 = ListNodeBuilder.build("7->2->4->3");
        ListNode l2 = ListNodeBuilder.build("5->6->4");
        ListNode l3 = solution_0445.addTwoNumbers(l1, l2);
        l3.display();
        //7 -> 8 -> 0 -> 7
        Assert.assertEquals(7, l3.val);
        Assert.assertEquals(8, l3.next.val);
        Assert.assertEquals(0, l3.next.next.val);
        Assert.assertEquals(7, l3.next.next.next.val);
        Assert.assertEquals(null, l3.next.next.next.next);
    }

    @Test
    public void addTwoNumbersTest2() {
        ListNode l1 = ListNodeBuilder.build("4");
        ListNode l2 = ListNodeBuilder.build("6");
        ListNode l3 = solution_0445.addTwoNumbers(l1, l2);
        l3.display();
        //1->0
        Assert.assertEquals(1, l3.val);
        Assert.assertEquals(0, l3.next.val);
        Assert.assertEquals(null, l3.next.next);
    }
}
