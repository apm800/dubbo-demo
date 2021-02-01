package com.example.dubbo.dubboprovider.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.entity.User;
import com.example.dubbo.service.LoginService;

/**
 * @author zk
 * @date 2021/2/1 14:53
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(User user) {
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            return "账号或密码错误，请重新输入";
        } else {
            return "当前登录用户为：" + user.toString();
        }
    }
}
