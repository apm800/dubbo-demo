package com.example.dubbo.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.service.OrderService;

import java.math.BigDecimal;

/**
 * @author zk
 * @date 2021/2/1 14:54
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String genOrder(BigDecimal orderPrice) {
        return "生成订单金额为：" + orderPrice;
    }
}
