package org.sunrain.study.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qichao on 2019/11/16.
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * <p>
 * 例如，给定三角形：
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * <p>
 * 说明：
 * <p>
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0120 {

    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle == null || triangle.size() == 0) {
            return 0;
        }

        int triangleLength = triangle.size();

        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < triangle.size(); i++) {

            int length = triangle.get(i).size();

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < length; j++) {

                if (i == 0 && j == 0) {
                    list.add(triangle.get(0).get(0));
                    results.add(i, list);
                    continue;
                }

                int left = j == 0 ? Integer.MAX_VALUE : results.get(i - 1).get(j - 1) + triangle.get(i).get(j);

                int right = j == length - 1 ? Integer.MAX_VALUE : results.get(i - 1).get(j) + triangle.get(i).get(j);

                if (right > left) {
                    list.add(left);
                } else {
                    list.add(right);
                }
            }

            results.add(i, list);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < results.get(triangleLength - 1).size(); i++) {
            if (results.get(triangleLength - 1).get(i) < min) {
                min = results.get(triangleLength - 1).get(i);
            }
        }

        return min;
    }
}
