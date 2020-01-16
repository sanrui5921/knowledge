package org.sunrain.study.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * 示例 2:
 * <p>
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-product-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0152 {

    public int maxProduct(int[] nums) {

        return 0;
    }

    public int maxProduct1(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (j == i) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[j]);
                    results.add(i, list);
                    continue;
                }
                List<Integer> list = results.get(i);
                list.add(list.get(list.size() - 1) * nums[j]);
            }
        }

        int min = Integer.MIN_VALUE;

        int mainSize = results.size();
        for (int i = 0; i < mainSize; i++) {
            int size = results.get(i).size();
            for (int j = 0; j < size; j++) {
                if (results.get(i).get(j) > min) {
                    min = results.get(i).get(j);
                }
            }
        }

        return min;
    }
}
