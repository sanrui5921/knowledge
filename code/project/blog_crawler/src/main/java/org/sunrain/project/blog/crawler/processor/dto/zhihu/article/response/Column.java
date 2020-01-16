package org.sunrain.project.blog.crawler.processor.dto.zhihu.article.response;

/**
 * Copyright 2020 bejson.com
 */

import lombok.Data;

/**
 * Auto-generated: 2020-01-08 17:10:25
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Column {

    private String id;

    private String type;

    private String url;

    private Author author;

    private String title;

    private String image_url;

    private String comment_permission;

    private long updated;
}