package com.git;

import com.git.common.event.ConfigInitializerEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */
@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TaskApplication.class);
        application.addInitializers(new ConfigInitializerEvent());
        application.run();
    }
}

