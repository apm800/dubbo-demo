package com.example.dubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.commonapi.entity.User;
import com.example.commonapi.service.LoginService;
import com.example.commonapi.service.OrderService;
import com.example.dubboconsumer.service.RemoteService;

import java.math.BigDecimal;

/**
 * @author zk
 * @date 2021/1/22 14:07
 */
@Service
public class RemoteServiceImpl implements RemoteService {

    @Reference
    private LoginService loginService;
    @Reference
    private OrderService orderService;

    @Override
    public String login(User user) {
        return loginService.login(user);
    }

    @Override
    public String genOrder(BigDecimal orderPrice) {
        return orderService.genOrder(orderPrice);
    }
}
