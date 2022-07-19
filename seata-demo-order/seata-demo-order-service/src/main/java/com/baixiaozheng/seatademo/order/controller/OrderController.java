package com.baixiaozheng.seatademo.order.controller;

import com.baixiaozheng.seatademo.order.client.OrdersClient;
import com.baixiaozheng.seatademo.order.common.entity.Orders;
import com.baixiaozheng.seatademo.order.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController implements OrdersClient {

    @Autowired
    private OrdersService ordersService;

    @Override
    @PostMapping("save")
    public Orders save(Long userId, String orderNo) {
        Orders orders = new Orders();
        orders.setUserId(userId).setOrderNo(orderNo);
        ordersService.save(orders);
        return orders;
    }
}
