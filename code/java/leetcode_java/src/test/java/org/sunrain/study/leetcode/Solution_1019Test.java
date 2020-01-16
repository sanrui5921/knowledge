package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ArrayUtils;
import org.sunrain.study.utils.ListNodeBuilder;

public class Solution_1019Test {

    Solution_1019 solution;

    @Before
    public void init() {
        solution = new Solution_1019();
    }

    @Test
    public void nextLargerNodesTest1() {
        int[] array = {2, 1, 5};
        ListNode node = ListNodeBuilder.build(array);
        Assert.assertEquals("[5,5,0]", ArrayUtils.show(solution.nextLargerNodes(node)));
    }

    @Test
    public void nextLargerNodesTest2() {
        int[] array = {2, 7, 4, 3, 5};
        ListNode node = ListNodeBuilder.build(array);
        Assert.assertEquals("[7,0,5,5,0]", ArrayUtils.show(solution.nextLargerNodes(node)));
    }

    @Test
    public void nextLargerNodesTest3() {
        int[] array = {1, 7, 5, 1, 9, 2, 5, 1};
        ListNode node = ListNodeBuilder.build(array);
        Assert.assertEquals("[7,9,9,9,0,5,0,0]", ArrayUtils.show(solution.nextLargerNodes(node)));
    }
}
