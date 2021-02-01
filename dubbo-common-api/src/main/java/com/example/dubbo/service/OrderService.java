package com.example.dubbo.service;

import java.math.BigDecimal;

/**
 * @author zk
 * @date 2021/2/1 14:50
 */
public interface OrderService {
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
