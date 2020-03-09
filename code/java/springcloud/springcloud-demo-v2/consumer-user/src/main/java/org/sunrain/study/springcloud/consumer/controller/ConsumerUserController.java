package org.sunrain.study.springcloud.consumer.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.sunrain.study.springcloud.consumer.entity.User;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class ConsumerUserController {

//    @Autowired
//    private RestTemplate restTemplate;

//    private static final String url = "http://eurekaserver1:8001/provider/user";

    @Qualifier("eurekaClient")
    @Autowired
    public EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final String serviceID = "provider-user";

    @RequestMapping("/getServerInfo")
    public Object getServerInfo() {
        // 通过eurekaClient访问服务器获取某个命名的集群。
        // getNextServerFromEureka的第一个参数是服务器名称，可重复
        // 因为获得的是下一个,所以是负载均衡的
        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("provider-user", false);
        System.out.println("name:" + nextServerFromEureka.getAppName() + " port:" + nextServerFromEureka.getPort());
        return nextServerFromEureka;
    }

    // 触发的接口
    @RequestMapping("/getInfoFromClient")
    public Object getInfoFromClient() throws URISyntaxException {
        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("provider-user", false);
        System.out.println("name:" + nextServerFromEureka.getAppName() + " port:" + nextServerFromEureka.getPort());
        RestTemplate restTemplate = new RestTemplate();
        String u = "http://" + nextServerFromEureka.getIPAddr() + ":" + nextServerFromEureka.getPort() + "/getInfo";
        URI uri = new URI(u);
        String obj = restTemplate.getForObject(uri, String.class);
        System.out.println(obj.toString());
        return obj;
    }

    @RequestMapping(value = "/consumer/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User get(@PathVariable("id") Long id) {
        return null;
    }

    @RequestMapping(value = "/consumer/user", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public User add(@RequestBody User user) {
        return null;
    }
}
