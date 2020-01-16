package org.sunrain.project.blog.crawler;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

public class JuejinListPageProcesser implements PageProcessor {

    private Site site = Site.me()
            .addHeader("Cookie", "gr_user_id=687ecd2d-a55a-4741-988d-f3906e26cdf7; _ga=GA1.2.689447525.1484297212; ab={}; MEIQIA_EXTRA_TRACK_ID=8d5343dec68511e68378020af009bdc2; grwng_uid=40761b93-3106-4484-b936-f0727bb35c2e; Hm_lvt_93bbd335a208870aa1f296bcd6842e5e=1577092279,1577177708,1577177840,1577178824; _gid=GA1.2.86728622.1577945930; gr_session_id_89669d96c88aefbc=888e30d9-22a6-424e-8627-d56398a2252f; gr_cs1_888e30d9-22a6-424e-8627-d56398a2252f=objectId%3A579a2639165abd0061f0394a; gr_session_id_89669d96c88aefbc_888e30d9-22a6-424e-8627-d56398a2252f=true; auth=; auth.sig=25Jg_aucc6SpX1VH8RlCoh6azLU; QINGCLOUDELB=8015b18e7b6ee1bafcfd11812d999975a4db71eff5b47ab5974a1647066247c5|Xg7i1|Xg7i1; Hm_lpvt_93bbd335a208870aa1f296bcd6842e5e=1578033899")
            .addHeader("Accept-Encoding", "gzip, deflate, br")
            .addHeader("Accept-Language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,zh-TW;q=0.6")
            .addHeader("Referer", "https://juejin.im/welcome/backend")
            //.addHeader("Origin", "https://juejin.im")
            //.addHeader("Host", "juejin.im")
            .addHeader("X-Agent", "Juejin/Web")
            .addHeader("Sec-Fetch-Mode", "navigate")
            .addHeader("Sec-Fetch-Site", "none")
            .addHeader("Upgrade-Insecure-Requests", "1")
            .addHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36").setRetryTimes(3).setSleepTime(1000);

    @Override
    public void process(Page page) {
        System.out.println(page.getHtml().xpath("/html/body/div/div[2]/main/div/div/div[1]/ul"));
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new JuejinListPageProcesser()).setDownloader(new HttpClientDownloader()).addUrl("https://juejin.im/welcome/backend")
                .addPipeline(new ConsolePipeline()).run();
    }
}
