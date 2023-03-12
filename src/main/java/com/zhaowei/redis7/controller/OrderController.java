package com.zhaowei.redis7.controller;

import com.zhaowei.redis7.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@Api(tags = "订单接口")
public class OrderController {

    @Resource
    private OrderService orderService;

    @ApiOperation("新增订单")
    @PostMapping("/order/add")
    public void addOrder(){
        orderService.addOrder();
    }

    @ApiOperation("按照keyId查询订单")
    @GetMapping("/order/{keyId}")
    public String addOrder(@PathVariable Integer keyId){
        return orderService.getOrderKey(keyId);
    }
}
