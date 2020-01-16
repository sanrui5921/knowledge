package org.sunrain.project.blog.crawler.processor.dto.zhihu.article.response;

/**
 * Copyright 2020 bejson.com
 */

import java.util.List;

/**
 * Auto-generated: 2020-01-08 17:6:6
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@lombok.Data
public class ArticleQueryResponse {

    private List<Data> data;

    private Paging paging;

    private String fresh_text;
}