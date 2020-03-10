package org.sunrain.study.springcloud.consumer.controller;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.sunrain.study.springcloud.consumer.entity.CommonResult;
import org.sunrain.study.springcloud.consumer.entity.User;

import java.util.List;

@RestController
public class ConsumerUserController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String serviceID = "http://provider-user";

    @RequestMapping(value = "/consumer/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public CommonResult get(@PathVariable("id") Long id) {
        return restTemplate.getForEntity(serviceID + "/provider/user/" + id, CommonResult.class).getBody();
    }

    @RequestMapping(value = "/consumer/user", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public User add(@RequestBody User user) {
        return restTemplate.postForObject(serviceID + "/provider/user", user, User.class);
    }
}
