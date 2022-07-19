package com.baixiaozheng.seatademo.account.client;

import com.baixiaozheng.seatademo.account.common.entity.UserAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient("account-service")
public interface UserAccountClient {

    @RequestMapping(value = "/account/save", method = RequestMethod.POST, consumes = "application/json")
    UserAccount save(@RequestParam("userId") Long userId, @RequestParam("balance") BigDecimal balance);

}
