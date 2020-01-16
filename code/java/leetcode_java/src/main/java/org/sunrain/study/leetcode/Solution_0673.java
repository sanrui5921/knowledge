package org.sunrain.study.leetcode;

/**
 * 给定一个未排序的整数数组，找到最长递增子序列的个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,4,7]
 * 输出: 2
 * 解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
 * 示例 2:
 * <p>
 * 输入: [2,2,2,2,2]
 * 输出: 5
 * 解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
 * 注意: 给定的数组长度不超过 2000 并且结果一定是32位有符号整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0673 {

    public int findNumberOfLIS(int[] nums) {

        int[] last = new int[nums.length];

        for (int i = nums.length - 1; i > 0; i--) {
            boolean exist = false;
            for (int j = i - 1; j > 0; j--) {
                if (nums[j] < nums[i]) {
                    last[i] = j;
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                last[i] = -1;
            }
        }

        int[] resultArray = new int[nums.length];
        resultArray[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                resultArray[i] = resultArray[i - 1] + 1;
            } else if (last[i] == -1) {
                resultArray[i] = 1;
            } else {
                resultArray[i] = resultArray[last[i]] + 1;
            }
        }

        int max = resultArray[resultArray.length - 1];
        int total = 0;
        for (int i = resultArray.length - 1; i >= 0; i--) {
            if (resultArray[i] > max) {
                max = resultArray[i];
                continue;
            }
            if (resultArray[i] == max) {
                total++;
                continue;
            }
            if (resultArray[i] < max) {
                break;
            }
        }

        return total;
    }
}
