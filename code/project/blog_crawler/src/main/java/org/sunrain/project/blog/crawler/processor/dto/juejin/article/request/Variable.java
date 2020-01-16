package org.sunrain.project.blog.crawler.processor.dto.juejin.article.request;

/**
 * Copyright 2020 bejson.com
 */

import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-01-08 18:11:2
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Variable {
    private List<String> tags;
    private String category;
    private int first;
    private String after;
    private String order;
}