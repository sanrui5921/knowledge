package org.sunrain.study.spark.demo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.VoidFunction;
import scala.Tuple2;

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
        //reduce(sc);
        //reduceByKey(sc);
        //union(sc);
        //groupByKey(sc);
        sample(sc);
    }

    public static void sample(JavaSparkContext sc) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        JavaRDD<Integer> listRDD = sc.parallelize(list);
        /**
         * sample用来从RDD中抽取样本。他有三个参数
         * withReplacement: Boolean,
         *       true: 有放回的抽样
         *       false: 无放回抽象
         * fraction: Double：
         *      抽取样本的比例
         * seed: Long：
         *      随机种子
         */
        JavaRDD<Integer> sampleRDD = listRDD.sample(false, 0.1, 0);
        sampleRDD.foreach(new VoidFunction<Integer>() {
            @Override
            public void call(Integer num) throws Exception {
                System.out.print(num + " ");
            }
        });
    }

    public static void join(JavaSparkContext sc) {
        final List<Tuple2<Integer, String>> names = Arrays.asList(
                new Tuple2<Integer, String>(1, "东方不败"),
                new Tuple2<Integer, String>(2, "令狐冲"),
                new Tuple2<Integer, String>(3, "林平之")
        );
        final List<Tuple2<Integer, Integer>> scores = Arrays.asList(
                new Tuple2<Integer, Integer>(1, 99),
                new Tuple2<Integer, Integer>(2, 98),
                new Tuple2<Integer, Integer>(3, 97)
        );

        final JavaPairRDD<Integer, String> nemesrdd = sc.parallelizePairs(names);
        final JavaPairRDD<Integer, Integer> scoresrdd = sc.parallelizePairs(scores);
        /**
         * <Integer, 学号
         * Tuple2<String, 名字
         * Integer>> 分数
         */
        final JavaPairRDD<Integer, Tuple2<String, Integer>> joinRDD = nemesrdd.join(scoresrdd);
//        final JavaPairRDD<Integer, Tuple2<Integer, String>> join = scoresrdd.join(nemesrdd);
        joinRDD.foreach(new VoidFunction<Tuple2<Integer, Tuple2<String, Integer>>>() {
            @Override
            public void call(Tuple2<Integer, Tuple2<String, Integer>> tuple) throws Exception {
                System.out.println("学号：" + tuple._1 + " 名字：" + tuple._2._1 + " 分数：" + tuple._2._2);
            }
        });
    }

    public static void groupByKey(JavaSparkContext sc) {
        List<Tuple2<String, String>> list = Arrays.asList(
                new Tuple2("武当", "张三丰"),
                new Tuple2("峨眉", "灭绝师太"),
                new Tuple2("武当", "宋青书"),
                new Tuple2("峨眉", "周芷若")
        );
        JavaPairRDD<String, String> listRDD = sc.parallelizePairs(list);

        JavaPairRDD<String, Iterable<String>> groupByKeyRDD = listRDD.groupByKey();
        groupByKeyRDD.foreach(new VoidFunction<Tuple2<String, Iterable<String>>>() {
            @Override
            public void call(Tuple2<String, Iterable<String>> tuple) throws Exception {
                String menpai = tuple._1;
                Iterator<String> iterator = tuple._2.iterator();
                String people = "";
                while (iterator.hasNext()) {
                    people = people + iterator.next() + " ";
                }
                System.out.println("门派:" + menpai + "人员:" + people);
            }
        });
    }

    public static void union(JavaSparkContext sc) {
        final List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        final List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
        final JavaRDD<Integer> rdd1 = sc.parallelize(list1);
        final JavaRDD<Integer> rdd2 = sc.parallelize(list2);
        rdd1.union(rdd2)
                .foreach(new VoidFunction<Integer>() {
                    @Override
                    public void call(Integer number) throws Exception {
                        System.out.println(number + "");
                    }
                });
    }

    public static void reduceByKey(JavaSparkContext sc) {
        List<Tuple2<String, Integer>> list = Arrays.asList(
                new Tuple2<String, Integer>("武当", 99),
                new Tuple2<String, Integer>("少林", 97),
                new Tuple2<String, Integer>("武当", 89),
                new Tuple2<String, Integer>("少林", 77)
        );
        JavaPairRDD<String, Integer> listRDD = sc.parallelizePairs(list);
        //运行reduceByKey时，会将key值相同的组合在一起做call方法中的操作
        JavaPairRDD<String, Integer> result = listRDD.reduceByKey(new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer i1, Integer i2) throws Exception {
                return i1 + i2;
            }
        });
        result.foreach(new VoidFunction<Tuple2<String, Integer>>() {
            @Override
            public void call(Tuple2<String, Integer> tuple) throws Exception {
                System.out.println("门派: " + tuple._1 + "->" + tuple._2);
            }
        });
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
