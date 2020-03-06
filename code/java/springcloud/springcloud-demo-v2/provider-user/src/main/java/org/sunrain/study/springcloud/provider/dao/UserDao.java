package org.sunrain.study.springcloud.provider.dao;

import org.springframework.stereotype.Component;
import org.sunrain.study.springcloud.provider.entity.User;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class UserDao {

    public ConcurrentHashMap<Long, User> userMap = new ConcurrentHashMap<Long, User>();

    public AtomicLong id = new AtomicLong(1L);

    public User addUser(User user) {
        user.setId(id.getAndAdd(1));
        userMap.put(user.getId(), user);
        return user;
    }

    public User getById(Long id) {
        return userMap.get(id);
    }
}
