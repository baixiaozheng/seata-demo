package com.baixiaozheng.seatademo.order.client;

import com.baixiaozheng.seatademo.order.common.entity.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient("orders-service")
public interface OrdersClient {

    @RequestMapping(value = "/orders/save", method = RequestMethod.POST, consumes = "application/json")
    Orders save(@RequestParam("userId") Long userId, @RequestParam("orderNo") String orderNo);
}
