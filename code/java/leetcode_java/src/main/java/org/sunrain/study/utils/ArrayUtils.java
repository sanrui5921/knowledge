package org.sunrain.study.utils;

public class ArrayUtils {

    public static String show(int[] array) {
        if (array == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder("[");

        int length = array.length;
        for (int i = 0; i < length; i++) {
            builder.append(array[i]);
            if (i != length - 1) {
                builder.append(",");
            }
        }
        builder.append("]");

        return builder.toString();
    }
}
