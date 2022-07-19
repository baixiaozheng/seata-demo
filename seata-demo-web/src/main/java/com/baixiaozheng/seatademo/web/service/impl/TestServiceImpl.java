package com.baixiaozheng.seatademo.web.service.impl;

import com.baixiaozheng.seatademo.account.client.UserAccountClient;
import com.baixiaozheng.seatademo.order.client.OrdersClient;
import com.baixiaozheng.seatademo.web.service.TestService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private UserAccountClient userAccountClient;

    @Autowired
    private OrdersClient ordersClient;

    Long userId = 1L;


    @Override
    public void noSeata() {
        userAccountClient.save(userId,BigDecimal.ZERO);
        System.out.println(1/0);
        ordersClient.save(userId,UUID.randomUUID().toString());
    }

    @Override
    @GlobalTransactional
    public void hasSeata() {
        userAccountClient.save(userId,BigDecimal.ZERO);
        System.out.println(1/0);
        ordersClient.save(userId,UUID.randomUUID().toString());
    }
}
