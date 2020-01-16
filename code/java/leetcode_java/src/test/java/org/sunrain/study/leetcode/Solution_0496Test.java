package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sunrain.study.utils.ArrayUtils;

public class Solution_0496Test {

    Solution_0496 solution;

    @Before
    public void init() {
        solution = new Solution_0496();
    }

    @Test
    public void test1() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        Assert.assertEquals("[-1,3,-1]", ArrayUtils.show(result));
    }

    @Test
    public void test2() {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        Assert.assertEquals("[3,-1]", ArrayUtils.show(result));
    }
}
