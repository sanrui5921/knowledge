package org.sunrain.study.springcloud.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sunrain.study.springcloud.demo.client.UserRemoteClient;

@RestController
public class FeignController {

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/callHello")
    public String callHello() {
        //return restTemplate.getForObject("http://localhost:8083/house/hello",String.class);
        //String result = restTemplate.getForObject("http://eureka-client-user-service/user/hello",String.class);
        String result = userRemoteClient.hello();
        System.out.println("调用结果：" + result);
        return result;
    }
}
