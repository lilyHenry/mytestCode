package com.springmvc.service;

import com.springmvc.entity.User;

import java.util.List;


/**
 * Created by zyz on 2017/7/17.
 */
public interface UserService {

    /**
     *  根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    public User findByUsernameAndPwd(String username, String password);

    /**
     *  获取用户
     * @return
     */
    public List<User> find(User user);

    /**
     *  新增
     * @param user
     */
    public void add(User user);

    /**
     *  修改
     * @param user
     */
    public void update(User user);

    /**
     *  删除
     * @param id
     */
    public void delete(String id);
}
