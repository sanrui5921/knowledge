package org.sunrain.project.blog.crawler.persistence.repository.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.sunrain.project.blog.crawler.persistence.model.Blog;

public interface BlogElasticSearchRepository extends ElasticsearchRepository<Blog, Long> {

}
