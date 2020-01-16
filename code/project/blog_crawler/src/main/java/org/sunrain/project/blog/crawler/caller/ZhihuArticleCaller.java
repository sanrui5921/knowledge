package org.sunrain.project.blog.crawler.caller;

import cn.hutool.json.JSONUtil;
import org.sunrain.project.blog.crawler.processor.dto.zhihu.article.response.ArticleQueryResponse;
import org.sunrain.project.blog.crawler.utils.http.OkHttpRequestUtils;

import java.util.HashMap;
import java.util.Map;

public class ZhihuArticleCaller {

    public static void main(String[] args) throws Exception {

        Map<String, Object> params = new HashMap<>();

        /**
         * session_token:54841d9e85a43b863a02a2f275335e6e
         desktop:true
         page_number:5
         limit:6
         action:down
         after_id:23
         * */
        params.put("session_token", "54841d9e85a43b863a02a2f275335e6e");
        params.put("desktop", "true");
        params.put("page_number", "5");
        params.put("limit", "6");
        params.put("action", "down");
        params.put("after_id", "23");

        Map<String, Object> headers = new HashMap<>();

        headers.put("cookie", "q_c1=8f5578551b4145e59828372f82437338|1506586436000|1482224344000; __utma=155987696.207550707.1482834847.1519614931.1519614931.1; __DAYU_PP=RiAFNVf6m7iAViAQq63I23416bdd0dd9; _xsrf=pMDsy0IYiI2rLmBGLLfKQIivkN7QJePm; _zap=3c868402-7251-4f34-a2fb-a8ed0bb3cca8; z_c0=\"2|1:0|10:1574305764|4:z_c0|92:Mi4xRUhDckFnQUFBQUFBUUFLTTB2QUdDeVlBQUFCZ0FsVk41RTNEWGdDVXdtVkxtbk1WeFY4YnJVTzFmYmE5aU92S1Bn|dab2b400c120d10c464b3fd0032ec4e8861284a5340559ea06c57a65d78608a1\"; d_c0=\"AJDi22yGlhCPThPvUk9TcC0PUwb7uyVc4dQ=|1577759475\"; tst=r; q_c1=8f5578551b4145e59828372f82437338|1578296084000|1482224344000; Hm_lvt_98beee57fd2ef70ccdd5ca52b9740c49=1578382188,1578382209,1578466791,1578466957; Hm_lpvt_98beee57fd2ef70ccdd5ca52b9740c49=1578473587; KLBRSID=5430ad6ccb1a51f38ac194049bce5dfe|1578474150|1578466785");

        String content = OkHttpRequestUtils.doGet("https://www.zhihu.com/api/v3/feed/topstory/recommend", headers, params);

        ArticleQueryResponse response = JSONUtil.toBean(content, ArticleQueryResponse.class);

        System.out.println(response);

    }
}
