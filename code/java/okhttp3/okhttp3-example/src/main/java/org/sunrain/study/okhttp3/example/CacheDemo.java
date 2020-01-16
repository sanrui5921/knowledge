package org.sunrain.study.okhttp3.example;

import com.sun.deploy.Environment;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;

public class CacheDemo {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Cache cache = new Cache(new File(Environment.getDeploymentHome(), "cache"), 10 * 1024 * 1024);
        //1、创建OkHttpClient实例对象
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cache(cache)
                .build();
        //2、创建Request实例对象
        Request request = new Request.Builder()
                .url("")
                .get()
                .build();
        //3、使用client执行Request请求
        try {
            Response response = okHttpClient.newCall(request).execute();
            //从缓存中获取响应
            Response cacheResponse = response.cacheResponse();
            //从网络中获取响应
            Response networkResponse = response.networkResponse();
            System.out.println(response.body().string());
            System.out.println(cacheResponse.body().string());
            System.out.println(networkResponse.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        版权声明：本文为CSDN博主「HopCoder」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/dingshuhong_/article/details/80335499
    }
}
