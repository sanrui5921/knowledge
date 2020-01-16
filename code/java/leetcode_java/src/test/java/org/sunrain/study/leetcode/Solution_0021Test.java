package org.sunrain.study.leetcode;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_0021Test {

    Solution_0021 solution;

    @Before
    public void init() {
        solution = new Solution_0021();
    }

    @Test
    public void mergeTwoListsTest() {
        ListNode l1 = ListNodeBuilder.build("1->2->4");
        ListNode l2 = ListNodeBuilder.build("1->3->4");
        ListNode l3 = solution.mergeTwoLists(l1, l2);

        Assert.assertEquals(1, l3.val);
        Assert.assertEquals(1, l3.next.val);
        Assert.assertEquals(2, l3.next.next.val);
        Assert.assertEquals(3, l3.next.next.next.val);
        Assert.assertEquals(4, l3.next.next.next.next.val);
        Assert.assertEquals(4, l3.next.next.next.next.next.val);
    }
}
