package org.sunrain.study.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qichao on 2019/11/16.
 */
public class ListBuilder {

    public static List<List<Integer>> build(int[][] matrix) {
        if (matrix == null && matrix.length == 0) {
            return null;
        }

        List<List<Integer>> lists = new ArrayList<>();

        int length = matrix.length;
        for (int i = 0; i < length; i++) {

            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
            lists.add(list);
        }
        return lists;
    }
}
