package org.sunrain.study.springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sunrain.study.springcloud.provider.entity.User;
import org.sunrain.study.springcloud.provider.service.UserService;

@RestController
public class UserProviderController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/provider/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User get(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @RequestMapping(value = "/provider/user", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public User add(@RequestBody User user) {
        return userService.add(user);
    }
}
