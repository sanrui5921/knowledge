package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ListUtils;

import java.util.List;

/**
 * Created by qichao on 2019/11/18.
 */
public class Solution_0315Test {

    Solution_0315 solution;

    @Before
    public void init() {
        solution = new Solution_0315();
    }

    @Test
    public void test1() {
        int[] nums = {5, 2, 6, 1};
        List<Integer> result = solution.countSmaller(nums);
        Assert.assertEquals("[2,1,1,0]", ListUtils.show(result));
    }
}
