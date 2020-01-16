package org.sunrain.study.utils;

import java.util.List;

/**
 * Created by qichao on 2019/11/18.
 */
public class ListUtils {

    public static String show(List<Integer> list) {
        if (list == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder("[");

        int length = list.size();
        for (int i = 0; i < length; i++) {
            builder.append(list.get(i));
            if (i != length - 1) {
                builder.append(",");
            }
        }
        builder.append("]");

        return builder.toString();
    }
}
