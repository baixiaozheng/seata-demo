package com.baixiaozheng.seatademo.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.baixiaozheng.seatademo.account.repository")
@EntityScan(basePackages = {"com.baixiaozheng.seatademo.account.common.entity"})
@EnableFeignClients
public class SeataDemoAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataDemoAccountServiceApplication.class, args);
    }



}
