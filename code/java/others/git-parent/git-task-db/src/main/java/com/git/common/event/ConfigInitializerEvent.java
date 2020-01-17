package com.git.common.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
@Slf4j
public class ConfigInitializerEvent implements
        ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        String configName = "";
        try {
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            String profilesActive = configurableApplicationContext.getEnvironment()
                    .getProperty("spring.profiles.active");
            Resource[] resources = resolver.getResources(
                    "classpath*:config/" + profilesActive + "/*-" + profilesActive + ".yml");
            if (resources.length == 0) {
                log.error("未加载到其他外置配置文件");
                return;
            }
            for (Resource r : resources) {
                configName = r.getFilename();
                configurableApplicationContext.getEnvironment().getPropertySources()
                        .addLast(new YamlPropertySourceLoader().load(r.getDescription(), r).get(0));
                if (r.exists()) {
                    log.info("配置文件:{}加载成功", configName);
                } else {
                    log.error("未加载到其他外置配置文件");
                }
            }
        } catch (Exception e) {
            log.error("配置文件:{}加载错误", configName, e);
        }
    }
}
