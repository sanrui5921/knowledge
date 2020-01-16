package org.sunrain.study.okhttp3.example;

import okhttp3.*;

import java.io.IOException;

public class PostDemo {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        //1、创建OkHttpClient对象实例
        OkHttpClient okHttpClient = new OkHttpClient();
        //2、创建Request对象
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody = RequestBody.create(mediaType, "{}");
        Request request = new Request.Builder()
                .url("https://www.httpbin.org/post")
                .post(requestBody)
                .build();
        //3、执行Request请求
        try {
            Response response = okHttpClient.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        版权声明：本文为CSDN博主「HopCoder」的原创文章，遵循 CC 4.0 BY - SA 版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/dingshuhong_/article/details/80335499
    }
}
