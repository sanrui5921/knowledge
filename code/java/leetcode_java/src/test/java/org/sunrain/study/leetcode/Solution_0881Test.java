package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/19.
 */
public class Solution_0881Test {

    Solution_0881 solution;

    @Before
    public void init() {
        solution = new Solution_0881();
    }

    @Test
    public void test1() {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        Assert.assertEquals(3, solution.numRescueBoats(people, limit));
    }

    @Test
    public void test2() {
        int[] people = {1, 2};
        int limit = 3;
        Assert.assertEquals(1, solution.numRescueBoats(people, limit));
    }

    @Test
    public void test3() {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        Assert.assertEquals(4, solution.numRescueBoats(people, limit));
    }
}
