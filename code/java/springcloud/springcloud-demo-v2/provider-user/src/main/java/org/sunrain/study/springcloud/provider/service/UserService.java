package org.sunrain.study.springcloud.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunrain.study.springcloud.provider.dao.UserDao;
import org.sunrain.study.springcloud.provider.entity.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User add(User user) {
        return userDao.addUser(user);
    }

    public User getById(Long id) {
        return userDao.getById(id);
    }
}
