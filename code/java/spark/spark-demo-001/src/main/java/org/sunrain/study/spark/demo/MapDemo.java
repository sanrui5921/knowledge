package org.sunrain.study.spark.demo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;

import java.util.Arrays;

public class MapDemo {

    public static void main(String[] args) {
        SparkConf conf = new SparkConf();
        conf.setMaster("local");
        conf.setAppName("WordCount");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD listRdd = sc.parallelize(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        JavaRDD mapRdd = listRdd.map(new Function<Integer, Integer>() {
            @Override
            public Integer call(Integer o) throws Exception {
                return o + 100;
            }
        });

        mapRdd.foreach(new VoidFunction<Integer>() {
            @Override
            public void call(Integer o) throws Exception {
                System.out.println("o:" + o);
            }
        });
    }
}
