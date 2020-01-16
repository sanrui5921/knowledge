package org.sunrain.study.leetcode;


/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 请找出其中最小的元素。
 * <p>
 * 你可以假设数组中不存在重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0153 {

    public int findMin(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int min = nums[nums.length - 1];

        int low = 0;

        int high = nums.length - 1;

        if (low == high) {
            return nums[low];
        }

        if (nums[low] < nums[high]) {
            return nums[0];
        }

        if (nums[high] < nums[high - 1]) {
            return nums[high];
        }

        while (low <= high) {

            int middle = (low + high) / 2;

            if (nums[middle] > min) {
                low = middle + 1;
                continue;
            }

            if (nums[middle] < min) {
                min = nums[middle];
                high = middle - 1;
                continue;
            }
        }

        return min;
    }
}
