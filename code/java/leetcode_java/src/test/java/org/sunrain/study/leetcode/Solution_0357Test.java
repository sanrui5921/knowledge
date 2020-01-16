package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/18.
 */
public class Solution_0357Test {

    Solution_0357 solution;

    @Before
    public void init() {
        solution = new Solution_0357();
    }

    @Test
    public void test1() {
        int number = 2;
        Assert.assertEquals(91, solution.countNumbersWithUniqueDigits(number));
    }
}
