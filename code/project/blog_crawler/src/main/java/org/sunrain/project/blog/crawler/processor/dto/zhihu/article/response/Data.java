package org.sunrain.project.blog.crawler.processor.dto.zhihu.article.response; /**
 * Copyright 2020 bejson.com
 */

import java.util.List;

/**
 * Auto-generated: 2020-01-08 17:10:25
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@lombok.Data
public class Data {

    private String id;

    private String type;

    private int offset;

    private String verb;

    private long created_time;

    private long updated_time;

    private Target target;

    private String brief;

    private List<UninterestReason> uninterest_reasons;

    private String attached_info;

    private List<Actor> actors;

    private boolean show_actor_time;

    private String action_text;

    private String action_text_tpl;

    private boolean action_card;
}