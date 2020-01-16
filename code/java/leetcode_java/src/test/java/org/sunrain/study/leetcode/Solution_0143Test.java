package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0143Test {

    Solution_0143 solution;

    @Before
    public void init() {
        solution = new Solution_0143();
    }

    @Test
    public void reorderListTest1() {
        ListNode head = ListNodeBuilder.build("1->2->3->4");
        solution.reorderList(head);
        head.display();
        Assert.assertEquals(1, head.val);
        Assert.assertEquals(4, head.next.val);
        Assert.assertEquals(2, head.next.next.val);
        Assert.assertEquals(3, head.next.next.next.val);
    }

    @Test
    public void reorderListTest2() {
        //1->5->2->4->3
        ListNode head = ListNodeBuilder.build("1->2->3->4->5");
        solution.reorderList(head);
        head.display();
        Assert.assertEquals(1, head.val);
        Assert.assertEquals(5, head.next.val);
        Assert.assertEquals(2, head.next.next.val);
        Assert.assertEquals(4, head.next.next.next.val);
        Assert.assertEquals(3, head.next.next.next.next.val);
    }
}
