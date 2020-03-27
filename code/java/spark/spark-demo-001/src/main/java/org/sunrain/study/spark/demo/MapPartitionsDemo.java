package org.sunrain.study.spark.demo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.VoidFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MapPartitionsDemo {
    public static void main(String[] args) {

        SparkConf conf = new SparkConf();
        conf.setMaster("local");
        conf.setAppName("WordCount");
        JavaSparkContext sc = new JavaSparkContext(conf);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        //参数二代表这个rdd里面有两个分区
        JavaRDD<Integer> listRDD = sc.parallelize(list, 2);

        listRDD.mapPartitions(new FlatMapFunction<Iterator<Integer>, String>() {
            @Override
            public Iterator<String> call(Iterator<Integer> iterator) throws Exception {
                ArrayList<String> array = new ArrayList<>();
                while (iterator.hasNext()) {
                    array.add("hello " + iterator.next());
                }
                return array.iterator();
            }
        }).foreach(new VoidFunction<String>() {
            @Override
            public void call(String s) throws Exception {
                System.out.println(s);
            }
        });
    }
}
