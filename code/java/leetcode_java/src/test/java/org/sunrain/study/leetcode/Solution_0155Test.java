package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0155Test {

    Solution_0155 solution;

    @Before
    public void init() {
        solution = new Solution_0155();
    }

    @Test
    public void test1() {
        Solution_0155 minStack = new Solution_0155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.getMin());
    }
}
