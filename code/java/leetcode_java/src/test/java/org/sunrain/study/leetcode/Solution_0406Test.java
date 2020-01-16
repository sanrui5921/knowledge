package org.sunrain.study.leetcode;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by qichao on 2019/11/18.
 */
public class Solution_0406Test {

    Solution_0406 solution;

    @Before
    public void init() {
        solution = new Solution_0406();
    }

    @Test
    public void test1() {
        //[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] result = solution.reconstructQueue(people);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
}
