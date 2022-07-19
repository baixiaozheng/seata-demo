package com.baixiaozheng.seatademo.order.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baixiaozheng.seatademo.order.common.entity.Orders;
import com.baixiaozheng.seatademo.order.repository.OrdersRepository;
import com.baixiaozheng.seatademo.order.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders save(Orders orders) {
        log.info("save orders :{}", JSONObject.toJSONString(orders));
        ordersRepository.save(orders);
        log.info("saved orders :{}", JSONObject.toJSONString(orders));
        return orders;
    }


}
