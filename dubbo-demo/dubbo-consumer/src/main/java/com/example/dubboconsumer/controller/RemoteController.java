package com.example.dubboconsumer.controller;

import com.example.commonapi.entity.User;
import com.example.dubboconsumer.service.RemoteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author zk
 * @date 2021/1/22 14:06
 */
@RestController
@Api(tags = "远程调用接口", value = "RemoteController")
public class RemoteController {
    @Resource
    private RemoteService remoteService;

    @ApiOperation(value = "登录接口")
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    private String login(User user) {
        System.out.println("消费者发送【登录】请求");
        return remoteService.login(user);
    }

    @ApiOperation(value = "生成订单接口")
    @RequestMapping(method = RequestMethod.GET, value = "/genOrder")
    private String order(BigDecimal orderPrice) {
        System.out.println("消费者发送【订单】请求");
        return remoteService.genOrder(orderPrice);
    }
}
