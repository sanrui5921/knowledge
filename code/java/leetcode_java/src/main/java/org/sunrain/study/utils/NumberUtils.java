package org.sunrain.study.utils;

/**
 * Created by qichao on 2019/11/7.
 */
public class NumberUtils {

    public static double log(double N) {
        return Math.log(N) / Math.log(2);//Math.log的底为e
    }

    public static int log(int N) {
        return new Double(Math.log(N) / Math.log(2)).intValue() + 1;//Math.log的底为e
    }
}
