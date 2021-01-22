package com.example.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.commonapi.service.OrderService;

import java.math.BigDecimal;

/**
 * @author zk
 * @date 2021/1/22 14:02
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String genOrder(BigDecimal orderPrice) {
        System.out.println("生产者【订单】接口被调用");
        return "当前订单金额为：" + orderPrice;
    }
}
