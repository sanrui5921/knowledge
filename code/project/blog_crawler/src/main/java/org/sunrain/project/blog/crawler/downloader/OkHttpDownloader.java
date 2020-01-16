package org.sunrain.project.blog.crawler.downloader;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class OkHttpDownloader {

    public static void main(String[] args) throws IOException {
        String url = "https://www.zhihu.com/question/353341563/answer/916467978";
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()//默认就是GET请求，可以不写
                .build();
        Response response = okHttpClient.newCall(request).execute();
//        System.out.println(response.body().string());
        String content = response.body().string();
        Document doc = Jsoup.parse(content);
        System.out.println(doc.select("#Popover10-toggle"));
    }
}
