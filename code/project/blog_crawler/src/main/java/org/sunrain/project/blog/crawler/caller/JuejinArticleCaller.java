package org.sunrain.project.blog.crawler.caller;

import cn.hutool.json.JSONUtil;
import org.sunrain.project.blog.crawler.processor.dto.juejin.article.request.ArticleQueryRequest;
import org.sunrain.project.blog.crawler.processor.dto.juejin.article.request.Extension;
import org.sunrain.project.blog.crawler.processor.dto.juejin.article.request.Query;
import org.sunrain.project.blog.crawler.processor.dto.juejin.article.request.Variable;
import org.sunrain.project.blog.crawler.processor.dto.juejin.article.response.ArticleQueryResponse;
import org.sunrain.project.blog.crawler.utils.http.OkHttpRequestUtils;

import java.util.HashMap;
import java.util.Map;

public class JuejinArticleCaller {

    public static void main(String[] args) throws Exception {

        Variable variable = new Variable();
        variable.setCategory("5562b419e4b00c57d9b94ae2");
        variable.setFirst(20);
        variable.setAfter("0.123666037928669995");
        variable.setOrder("POPULAR");

        Query query = new Query();
        query.setId("653b587c5c7c8a00ddf67fc66f989d42");

        Extension extension = new Extension();
        extension.setQuery(query);

        ArticleQueryRequest request = new ArticleQueryRequest();
        request.setVariables(variable);
        request.setExtensions(extension);

        Map<String, Object> headers = new HashMap<>();
        headers.put("Referer", "https://juejin.im/welcome/backend");
        headers.put("Origin", "https://juejin.im");
        headers.put("Sec-Fetch-Mode", "cors");
        headers.put("Sec-Fetch-Site", "same-site");
        headers.put("X-Agent", "Juejin/Web");

        String content = OkHttpRequestUtils.doPost("https://web-api.juejin.im/query", headers, JSONUtil.toJsonStr(request));

        ArticleQueryResponse response = JSONUtil.toBean(content, ArticleQueryResponse.class);

        System.out.println(response);
    }
}
