package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0082Test {

    Solution_0082 solution;

    @Before
    public void init() {
        solution = new Solution_0082();
    }

    @Test
    public void deleteDuplicatesTest1() {
        ListNode l = ListNodeBuilder.build("1->2->3->3->4->4->5");
        ListNode result = solution.deleteDuplicates(l);
        //1->2->5
        Assert.assertEquals("1->2->5->", result.show());
    }

    @Test
    public void deleteDuplicatesTest2() {
        ListNode l = ListNodeBuilder.build("1->1->1->2->3");
        ListNode result = solution.deleteDuplicates(l);
        //2->3
        Assert.assertEquals("2->3->", result.show());
    }
}
