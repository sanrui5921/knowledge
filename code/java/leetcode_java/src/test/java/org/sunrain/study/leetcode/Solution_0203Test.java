package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0203Test {

    Solution_0203 solution;

    @Before
    public void init() {
        solution = new Solution_0203();
    }

    @Test
    public void removeElementsTest1() {
        ListNode list = ListNodeBuilder.build("1->2->6->3->4->5->6");
        ListNode result = solution.removeElements(list, 6);
        Assert.assertEquals("1->2->3->4->5", result.show());
    }
}
