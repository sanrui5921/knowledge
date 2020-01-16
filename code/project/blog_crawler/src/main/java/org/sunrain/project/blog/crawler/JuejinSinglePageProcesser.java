package org.sunrain.project.blog.crawler;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

public class JuejinSinglePageProcesser implements PageProcessor {

    private Site site = Site.me()
            .addHeader("Host", "entry-view-storage-api-ms.juejin.im")
            .addHeader("User-Agent", "Xitu/5.7.9 (iPhone; iOS 13.3; Scale/3.00)");

    @Override
    public void process(Page page) {
        System.out.println("#################################################");
        System.out.println(page.getRawText());
        System.out.println("#################################################");
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new JuejinSinglePageProcesser()).setDownloader(new HttpClientDownloader()).addUrl("https://entry-view-storage-api-ms.juejin.im/v1/getEntryView?device_id=7C246575-4731-4789-AF19-F68BBA9D6432&entryId=5e0a9c276fb9a015fd69d25e&src=ios")
                .addPipeline(new ConsolePipeline()).run();
    }
}
