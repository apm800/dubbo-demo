package com.example.dubboconsumer.service;

import com.example.commonapi.entity.User;

import java.math.BigDecimal;

/**
 * @author zk
 * @date 2021/1/22 14:06
 */
public interface RemoteService {
    /**
     * 登录
     *
     * @param user 用户信息
     * @return String
     * @author zk
     * @date 2021/1/22 13:54
     */
    String login(User user);

    /**
     * 生成订单
     *
     * @param orderPrice 订单价格
     * @return String
     * @author zk
     * @date 2021/1/22 13:55
     */
    String genOrder(BigDecimal orderPrice);
}
