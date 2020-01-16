package org.sunrain.study.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qichao on 2019/11/18.
 * <p>
 * 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
 * <p>
 * 注意：
 * 总人数少于1100人。
 * <p>
 * 示例
 * <p>
 * 输入:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * <p>
 * 输出:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/queue-reconstruction-by-height
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0406 {

    public int[][] reconstructQueue(int[][] people) {

        if (people == null || people.length == 0) {
            return people;
        }

        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            }
        });

        int length = people.length;
        int[][] newPeople = new int[length][2];
        newPeople[0] = people[0];
        for (int i = 1; i < length; i++) {
            if (i > people[i][1]) {
                move(newPeople, people[i][1], i);
            }
            newPeople[people[i][1]] = people[i];
        }
        return newPeople;
    }

    public void move(int[][] ins, int start, int end) {
        for (int i = end; i > start; i--) {
            ins[i] = ins[i - 1];
        }
    }
}
