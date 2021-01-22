package com.example.dubboprovider.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.commonapi.entity.User;
import com.example.commonapi.service.LoginService;

/**
 * @author zk
 * @date 2021/1/22 13:57
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String login(User user) {
        System.out.println("生产者【登录】接口被调用");
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            return "账号或密码为空";
        }
        return "当前登录用户是：" + user.toString();
    }
}
