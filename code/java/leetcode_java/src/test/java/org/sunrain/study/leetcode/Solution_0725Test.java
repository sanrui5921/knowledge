package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0725Test {

    Solution_0725 solution_0725;

    @Before
    public void init() {
        solution_0725 = new Solution_0725();
    }

    @Test
    public void splitListToPartsTest1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListNode head = ListNodeBuilder.build(array);
        ListNode[] lists = solution_0725.splitListToParts(head, 3);
        //[[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
        Assert.assertEquals(3, lists.length);

        Assert.assertEquals(1, lists[0].val);
        Assert.assertEquals(2, lists[0].next.val);
        Assert.assertEquals(3, lists[0].next.next.val);
        Assert.assertEquals(4, lists[0].next.next.next.val);

        Assert.assertEquals(5, lists[1].val);
        Assert.assertEquals(6, lists[1].next.val);
        Assert.assertEquals(7, lists[1].next.next.val);

        Assert.assertEquals(8, lists[2].val);
        Assert.assertEquals(9, lists[2].next.val);
        Assert.assertEquals(10, lists[2].next.next.val);
    }

    @Test
    public void splitListToPartsTest2() {
        int[] array = {1, 2, 3};
        ListNode head = ListNodeBuilder.build(array);
        ListNode[] lists = solution_0725.splitListToParts(head, 5);
        Assert.assertEquals(5, lists.length);
        //[[1],[2],[3],[],[]]
        Assert.assertEquals(1, lists[0].val);
        Assert.assertEquals(null, lists[0].next);

        Assert.assertEquals(2, lists[1].val);
        Assert.assertEquals(null, lists[1].next);

        Assert.assertEquals(3, lists[2].val);
        Assert.assertEquals(null, lists[2].next);

        Assert.assertEquals(null, lists[3]);

        Assert.assertEquals(null, lists[4]);
    }
}
