package org.sunrain.study.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.sunrain.study.springcloud.consumer.entity.User;

import java.util.List;

@RestController
public class ConsumerUserController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "http://127.0.0.1:8001/provider/user";

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final String serviceID = "provider-user";

    @RequestMapping(value = "/consumer/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User get(@PathVariable("id") Long id) {
        List<ServiceInstance> clients = discoveryClient.getInstances(serviceID);

        for (ServiceInstance instance : clients) {
            System.out.println("*************************");
            System.out.println(instance);
            System.out.println("*************************");
        }

        return restTemplate.getForEntity(url + "/" + id, User.class).getBody();
    }

    @RequestMapping(value = "/consumer/user", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public User add(@RequestBody User user) {
        return restTemplate.postForObject(url, user, User.class);
    }
}
