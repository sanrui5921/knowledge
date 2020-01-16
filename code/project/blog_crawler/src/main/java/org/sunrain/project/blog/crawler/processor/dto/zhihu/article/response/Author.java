package org.sunrain.project.blog.crawler.processor.dto.zhihu.article.response;

/**
 * Copyright 2020 bejson.com
 */

import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-01-08 17:6:6
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Author {

    private String id;

    private String type;

    private String url;

    private String user_type;

    private String url_token;

    private String name;

    private String headline;

    private String avatar_url;

    private boolean is_org;

    private int gender;

    private List<Badge> badge;

    private int followers_count;

    private boolean is_following;

    private boolean is_followed;
}