package org.sunrain.study.okhttp3.example;

import okhttp3.*;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) {
        String url = "http://wwww.baidu.com";
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()//默认就是GET请求，可以不写
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("fail");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println(response.body().string());
                //Log.d(TAG, "onResponse: " + response.body().string());
            }
        });
        System.out.println("test");
    }

    public static void test1() {

    }
}
