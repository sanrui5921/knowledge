package org.sunrain.project.blog.crawler.persistence.repository.mysql;

import org.springframework.data.repository.CrudRepository;
import org.sunrain.project.blog.crawler.persistence.model.Blog;

public interface BlogMysqlRepository extends CrudRepository<Blog, Long> {

}
