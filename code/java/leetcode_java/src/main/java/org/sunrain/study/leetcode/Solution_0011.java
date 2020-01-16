package org.sunrain.study.leetcode;


/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0011 {

    public int maxArea(int[] height) {

        int max = 0;

        int size = height.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int area = (j - i) * (height[i] > height[j] ? height[j] : height[i]);
                if (area > max) {
                    max = area;
                }
            }
        }

        return max;
    }

    public int maxArea1(int[] height) {

        int max = 0;

        int left = 0;

        int right = height.length - 1;

        while (left < right) {

            int area = (right - left) * (height[left] > height[right] ? height[right] : height[left]);

            if (area > max) {
                max = area;
            }

            if (height[left] > height[right]) {
                right = right - 1;
            } else {
                left = left + 1;
            }
        }
        return max;
    }
}
