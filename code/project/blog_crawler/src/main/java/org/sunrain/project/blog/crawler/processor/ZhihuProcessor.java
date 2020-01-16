package org.sunrain.project.blog.crawler.processor;

import org.sunrain.project.blog.crawler.HttpClientDownloader;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

public class ZhihuProcessor implements PageProcessor {

    private Site site = Site.me()
            .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
            .addHeader("Accept-Encoding", "gzip, deflate, br")
            .addHeader("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36")
            .addHeader("cookie", "q_c1=8f5578551b4145e59828372f82437338|1506586436000|1482224344000; __utma=155987696.207550707.1482834847.1519614931.1519614931.1; __DAYU_PP=RiAFNVf6m7iAViAQq63I23416bdd0dd9; _xsrf=pMDsy0IYiI2rLmBGLLfKQIivkN7QJePm; _zap=3c868402-7251-4f34-a2fb-a8ed0bb3cca8; z_c0=\"2|1:0|10:1574305764|4:z_c0|92:Mi4xRUhDckFnQUFBQUFBUUFLTTB2QUdDeVlBQUFCZ0FsVk41RTNEWGdDVXdtVkxtbk1WeFY4YnJVTzFmYmE5aU92S1Bn|dab2b400c120d10c464b3fd0032ec4e8861284a5340559ea06c57a65d78608a1\"; d_c0=\"AJDi22yGlhCPThPvUk9TcC0PUwb7uyVc4dQ=|1577759475\"; tst=r; q_c1=8f5578551b4145e59828372f82437338|1578296084000|1482224344000; Hm_lvt_98beee57fd2ef70ccdd5ca52b9740c49=1578382188,1578382209,1578466791,1578466957; Hm_lpvt_98beee57fd2ef70ccdd5ca52b9740c49=1578473568; KLBRSID=5430ad6ccb1a51f38ac194049bce5dfe|1578473577|1578466785");

    @Override
    public void process(Page page) {
        System.out.println(page.getHtml().css("#TopstoryContent > div > div"));
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new ZhihuProcessor()).setDownloader(new HttpClientDownloader()).addUrl("https://www.zhihu.com/")
                .addPipeline(new ConsolePipeline()).run();
    }
}
