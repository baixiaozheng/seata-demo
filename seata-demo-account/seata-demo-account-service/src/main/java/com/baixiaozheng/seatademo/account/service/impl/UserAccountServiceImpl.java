package com.baixiaozheng.seatademo.account.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baixiaozheng.seatademo.account.common.entity.UserAccount;
import com.baixiaozheng.seatademo.account.repository.UserAccountRepository;
import com.baixiaozheng.seatademo.account.service.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    @Transactional
    public UserAccount save(UserAccount account) {
        log.info("save user account:{}", JSONObject.toJSONString(account));
        userAccountRepository.save(account);
        log.info("saved user account:{}", JSONObject.toJSONString(account));
        return account;
    }



}
