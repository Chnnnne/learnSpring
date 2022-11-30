package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @author WangChen
 * @create 2022-11-23 21:12
 * @project: ssm2
 * @ClassName: AccountService
 */
public interface AccountService {
    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);

    //这个没人帮写实现类了 （Dao有MyBatis编写）
}
