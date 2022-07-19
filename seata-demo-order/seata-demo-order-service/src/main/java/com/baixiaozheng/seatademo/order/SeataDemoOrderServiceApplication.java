package com.baixiaozheng.seatademo.order;

import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;


@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.baixiaozheng.seatademo.order.repository")
@EntityScan(basePackages = {"com.baixiaozheng.seatademo.order.common.entity"})
public class SeataDemoOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataDemoOrderServiceApplication.class, args);
    }

}
