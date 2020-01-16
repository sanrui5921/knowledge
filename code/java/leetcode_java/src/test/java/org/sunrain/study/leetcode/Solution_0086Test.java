package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0086Test {

    Solution_0086 solution;

    @Before
    public void init() {
        solution = new Solution_0086();
    }

    @Test
    public void partitionTest1() {
        String s = "1->4->3->2->5->2";
        //1->2->2->4->3->5
        ListNode node = ListNodeBuilder.build(s);
        ListNode newNode = solution.partition(node, 3);
        Assert.assertEquals("1->2->2->4->3->5", newNode.show());
    }
}
