package com.springmvc.service.impl;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zyz on 2017/7/17.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource(name = "UserDao")
    private UserDao userDao;

    public User findByUsernameAndPwd(String username, String password) {
        return userDao.findByUsernameAndPwd(username,password);
    }

    public List<User> find(User user) {
        return userDao.find(user);
    }

    public void add(User user) {
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(String id) {
        userDao.delete(id);
    }
}
