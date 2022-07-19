package com.baixiaozheng.seatademo.account.controller;

import com.baixiaozheng.seatademo.account.client.UserAccountClient;
import com.baixiaozheng.seatademo.account.common.entity.UserAccount;
import com.baixiaozheng.seatademo.account.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("account")
public class AccountController implements UserAccountClient {
    @Autowired
    private UserAccountService userAccountService;

    @PostMapping("save")
    public UserAccount save(Long userId, BigDecimal balance){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserId(userId)
                        .setBalance(balance);
        userAccountService.save(userAccount);
        return userAccount;
    }
}
