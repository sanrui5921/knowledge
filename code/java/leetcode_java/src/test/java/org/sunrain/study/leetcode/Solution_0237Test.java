package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0237Test {

    Solution_0237 solution;

    @Before
    public void init() {
        solution = new Solution_0237();
    }

    @Test
    public void deleteNodeTest1() {
        int[] array = {4, 5, 1, 9};
        ListNode list = ListNodeBuilder.build(array);
        solution.deleteNode(list.next);
        Assert.assertEquals("4->1->9", list.show());
    }

    @Test
    public void deleteNodeTest2() {
        int[] array = {4, 5, 1, 9};
        ListNode list = ListNodeBuilder.build(array);
        solution.deleteNode(list.next.next);
        Assert.assertEquals("4->5->9", list.show());
    }
}
