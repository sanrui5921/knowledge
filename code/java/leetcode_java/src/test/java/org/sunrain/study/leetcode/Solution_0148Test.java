package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0148Test {

    Solution_0148 solution;

    @Before
    public void init() {
        solution = new Solution_0148();
    }

    @Test
    public void sortListTest1() {
        ListNode list = ListNodeBuilder.build("4->2->1->3");
        Assert.assertEquals("1->2->3->4", solution.sortList(list).show());
    }

    @Test
    public void sortListTest2() {
        ListNode list = ListNodeBuilder.build("-1->5->3->4->0");
        Assert.assertEquals("-1->0->3->4->5", solution.sortList(list).show());
    }
}
