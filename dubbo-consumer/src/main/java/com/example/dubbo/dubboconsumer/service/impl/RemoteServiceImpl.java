package com.example.dubbo.dubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.dubboconsumer.service.RemoteService;
import com.example.dubbo.entity.User;
import com.example.dubbo.service.LoginService;
import com.example.dubbo.service.OrderService;

import java.math.BigDecimal;

/**
 * @author zk
 * @date 2021/1/22 14:07
 */
@Service//注意引用的包
public class RemoteServiceImpl implements RemoteService {

    @Reference//注意引用的包
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
