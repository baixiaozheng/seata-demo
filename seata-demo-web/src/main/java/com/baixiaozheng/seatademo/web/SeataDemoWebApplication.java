package com.baixiaozheng.seatademo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients({"com.baixiaozheng.seatademo.order.client","com.baixiaozheng.seatademo.account.client"})
public class SeataDemoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataDemoWebApplication.class, args);
    }



}
