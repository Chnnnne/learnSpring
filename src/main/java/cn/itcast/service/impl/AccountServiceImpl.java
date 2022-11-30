package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangChen
 * @create 2022-11-23 21:14
 * @project: ssm2
 * @ClassName: AccountServiceImpl
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：findAll方法");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：saveAccount方法");
    }
}
