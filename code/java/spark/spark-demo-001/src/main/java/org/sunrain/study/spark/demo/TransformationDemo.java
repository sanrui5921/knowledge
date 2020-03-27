package org.sunrain.study.spark.demo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.VoidFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TransformationDemo {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf();
        conf.setMaster("local");
        conf.setAppName("WordCount");
        JavaSparkContext sc = new JavaSparkContext(conf);


//        map(sc);
//        flatMap(sc);
//        mapPartitions(sc);
//        mapPartitionsWithIndex(sc);
        reduce(sc);
    }

    public static void reduce(JavaSparkContext sc) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        JavaRDD<Integer> listRDD = sc.parallelize(list);

        Integer result = listRDD.reduce(new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer i1, Integer i2) throws Exception {
                System.out.println("i1:" + i1 + ",i2:" + i2);
                return i1 + i2;
            }
        });
        System.out.println(result);
    }


    public static void mapPartitionsWithIndex(JavaSparkContext sc) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        JavaRDD<Integer> listRDD = sc.parallelize(list, 2);
        listRDD.mapPartitionsWithIndex(new Function2<Integer, Iterator<Integer>, Iterator<String>>() {
            @Override
            public Iterator<String> call(Integer index, Iterator<Integer> iterator) throws Exception {
                ArrayList<String> list1 = new ArrayList<>();
                while (iterator.hasNext()) {
                    list1.add(index + "_" + iterator.next());
                }
                return list1.iterator();
            }
        }, true)
                .foreach(new VoidFunction<String>() {
                    @Override
                    public void call(String s) throws Exception {
                        System.out.println(s);
                    }
                });
    }

    /**
     * map:
     * 一条数据一条数据的处理（文件系统，数据库等等）
     * mapPartitions：
     * 一次获取的是一个分区的数据（hdfs）
     * 正常情况下，mapPartitions 是一个高性能的算子
     * 因为每次处理的是一个分区的数据，减少了去获取数据的次数。
     * <p>
     * 但是如果我们的分区如果设置得不合理，有可能导致每个分区里面的数据量过大。
     */
    public static void mapPartitions(JavaSparkContext sc) {
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

    public static void flatMap(JavaSparkContext sc) {
        List<String> list = Arrays.asList("张无忌 赵敏", "宋青书 周芷若");
        JavaRDD<String> listRDD = sc.parallelize(list);

        JavaRDD<String> nameRDD = listRDD
                .flatMap(new FlatMapFunction<String, String>() {
                    @Override
                    public Iterator<String> call(String line) throws Exception {
                        return Arrays.asList(line.split(" ")).iterator();
                    }
                })
                .map(new Function<String, String>() {
                    @Override
                    public String call(String name) throws Exception {
                        return "Hello " + name;
                    }
                });

        nameRDD.foreach(new VoidFunction<String>() {
            @Override
            public void call(String s) throws Exception {
                System.out.println(s);
            }
        });

    }

    public static void map(JavaSparkContext sc) {
        //String[] names = {"张无忌","赵敏","周芷若"};
        List<String> list = Arrays.asList("张无忌", "赵敏", "周芷若");
        System.out.println(list.size());
        JavaRDD<String> listRDD = sc.parallelize(list);


        JavaRDD<String> nameRDD = listRDD.map(new Function<String, String>() {
            @Override
            public String call(String name) throws Exception {
                return "Hello " + name;
            }
        });

        nameRDD.foreach(new VoidFunction<String>() {
            @Override
            public void call(String s) throws Exception {
                System.out.println(s);
            }
        });
    }
}
