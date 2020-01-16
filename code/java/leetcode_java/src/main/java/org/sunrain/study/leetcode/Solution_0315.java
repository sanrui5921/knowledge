package org.sunrain.study.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qichao on 2019/11/18.
 * <p>
 * 给定一个整数数组 nums，按要求返回一个新数组 counts。
 * 数组 counts 有该性质： counts[i] 的值是  nums[i] 右侧小于 nums[i] 的元素的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: [5,2,6,1]
 * 输出: [2,1,1,0]
 * 解释:
 * 5 的右侧有 2 个更小的元素 (2 和 1).
 * 2 的右侧仅有 1 个更小的元素 (1).
 * 6 的右侧有 1 个更小的元素 (1).
 * 1 的右侧有 0 个更小的元素.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0315 {

    public List<Integer> countSmaller(int[] nums) {
        return null;
//        if (nums == null || nums.length == 0) {
//            return new ArrayList<>();
//        }
//
//        int length = nums.length;
//
//        List<Integer> results = new ArrayList<>(length);
//
//        for (int i = 0; i < length; i++) {
//            results.add(i, 0);
//        }
//
//        int[][] matrix = new int[length][2];
//
//        for (int i = 0; i < length; i++) {
//            matrix[i][0] = nums[i];
//            matrix[i][1] = i;
//        }
//
//        Arrays.sort(matrix, new Comparator<int[]>() {
//            public int compare(int[] a, int[] b) {
//                if (a[0] == b[0]) {
//                    return a[1] - b[1];
//                }
//                return a[0] - b[0];
//            }
//        });
//
//        int moved = 0;
//        for (int i = 0; i < length; i++) {
//            if (matrix[i][1] > i) {
//                moved++;
//                results.set(matrix[i][1], 0);
//            } else if (matrix[i][1] == i) {
//                results.set(matrix[i][1], i - matrix[i][1] + moved);
//            } else {
//                results.set(matrix[i][1], i - matrix[i][1]);
//            }
//        }
//
//        return results;
    }

    //超出时间限制
    public List<Integer> countSmaller1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> results = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int total = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    total++;
                }
            }
            results.add(total);
        }

        return results;
    }
}
