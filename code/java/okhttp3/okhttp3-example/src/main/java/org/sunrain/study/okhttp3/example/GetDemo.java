package org.sunrain.study.okhttp3.example;

import okhttp3.*;

import java.io.IOException;

public class GetDemo {

    public static void main(String[] args) {
        syncGetDemo();
        asyncGetDemo();
    }

    public static void syncGetDemo() {
        //同步请求
        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://www.httpbin.org/get?id=111")
                    .addHeader("key", "value")
                    .get()
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            System.out.println(response.code());
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void asyncGetDemo() {
        //创建OkHttpClient实例对象
        OkHttpClient okHttpClient = new OkHttpClient();
        //创建Request对象
        Request request = new Request.Builder()
                .url("https://www.httpbin.org/get?id=111")
                .addHeader("key", "value")
                .get()
                .build();
        //执行Request请求
        //异步请求
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //请求失败
                System.out.println();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //请求成功
                System.out.println("TestOkHttp:" + response.body().string());
            }
        });
    }
}
//版权声明：本文为CSDN博主「HopCoder」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/dingshuhong_/article/details/80335499
