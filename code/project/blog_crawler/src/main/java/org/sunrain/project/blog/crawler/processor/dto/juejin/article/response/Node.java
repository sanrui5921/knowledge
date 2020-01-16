package org.sunrain.project.blog.crawler.processor.dto.juejin.article.response;
/**
 * Copyright 2020 bejson.com
 */

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2020-01-08 18:4:3
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Node {
    private String id;
    private int commentsCount;
    private boolean hot;
    private double hotIndex;
    private boolean original;
    private String originalUrl;
    private double rankIndex;
    private String screenshot;
    private String summaryInfo;
    private List<Tag> tags;
    private String title;
    private String type;
    private User user;
    private Date lastCommentTime;
    private int likeCount;
    private String eventInfo;
    private boolean viewerHasLiked;
    private Date createdAt;
    private Date updatedAt;
}