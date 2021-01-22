package com.example.commonapi.service;

import com.example.commonapi.entity.User;

/**
 * @author zk
 * @date 2021/1/22 13:54
 */
public interface LoginService {
    /**
     * 登录
     *
     * @param user 用户信息
     * @return String
     * @author zk
     * @date 2021/1/22 13:54
     */
    String login(User user);
}
