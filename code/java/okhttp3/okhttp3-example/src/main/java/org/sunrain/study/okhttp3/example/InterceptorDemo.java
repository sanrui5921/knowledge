package org.sunrain.study.okhttp3.example;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

//OKHttp3.0的日常及入门 https://blog.csdn.net/biezhihua/article/details/50603624
//https://blog.csdn.net/qq_29152241/article/details/82011539
public class InterceptorDemo {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Interceptor loggingInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                //我这里参考的是官网的，你也可以定义里自己的打印方式
                long t1 = System.nanoTime();
                System.out.println(String.format("Sending request %s on %s%n%s", request.url(), chain.connection(), request.headers()));
                Response response = chain.proceed(request);
                long t2 = System.nanoTime();
                System.out.println(String.format("Received response for %s in %.1fms%n%s", response.request().url(), (t2 - t1) / 1e6d, response.headers()));
                return response;
            }
        };
        //1、创建OkHttpClient实例对象
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                //.addNetworkInterceptor() // 添加网络拦截器
                .build();
        //2、创建Request实例对象
        Request request = new Request.Builder()
                .url("https://www.httpbin.org/get?id=111")
                .get()
                .build();
        //3、使用client执行request请求
        try {
            Response response = okHttpClient.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //版权声明：本文为CSDN博主「HopCoder」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
        //原文链接：https://blog.csdn.net/dingshuhong_/article/details/80335499
    }
}
