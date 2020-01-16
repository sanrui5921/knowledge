package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/18.
 */
public class Solution_0792Test {

    Solution_0792 solution;

    @Before
    public void init() {
        solution = new Solution_0792();
    }

    @Test
    public void test1() {
        String str = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        Assert.assertEquals(3, solution.numMatchingSubseq(str, words));
    }
}
