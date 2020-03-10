package org.sunrain.study.springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.sunrain.study.springcloud.provider.entity.CommonResult;
import org.sunrain.study.springcloud.provider.entity.ServerInfo;
import org.sunrain.study.springcloud.provider.entity.User;
import org.sunrain.study.springcloud.provider.service.UserService;

@RestController
public class UserProviderController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/provider/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public CommonResult<User> get(@PathVariable("id") Long id) {
        return new CommonResult<>(userService.getById(id), new ServerInfo(serverPort));
    }

    @RequestMapping(value = "/provider/user", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public User add(@RequestBody User user) {
        return userService.add(user);
    }
}
