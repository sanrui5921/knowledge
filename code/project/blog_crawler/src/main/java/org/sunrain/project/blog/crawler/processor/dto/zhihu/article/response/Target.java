package org.sunrain.project.blog.crawler.processor.dto.zhihu.article.response;

/**
 * Copyright 2020 bejson.com
 */

import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-01-08 17:10:25
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Target {

    private long id;

    private String type;

    private String url;

    private Author author;

    private String title;

    private String excerpt_title;

    private String image_url;

    private String comment_permission;

    private long created;

    private long updated;

    private int voteup_count;

    private int voting;

    private List<String> upvoted_followees;

    private int comment_count;

    private Linkbox linkbox;

    private String excerpt;

    private String excerpt_new;

    private String preview_type;

    private String preview_text;

    private Column column;

    private String content;

    private boolean is_labeled;

    private int visited_count;
}