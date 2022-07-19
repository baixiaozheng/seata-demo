package com.baixiaozheng.seatademo.account.repository;

import com.baixiaozheng.seatademo.account.common.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserAccountRepository extends JpaRepository<UserAccount,Long>, JpaSpecificationExecutor<UserAccount> {
}
