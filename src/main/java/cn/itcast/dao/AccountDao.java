package cn.itcast.dao;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @author WangChen
 * @create 2022-11-23 21:10
 * @project: ssm2
 * @ClassName: AccountDao
 */
public interface AccountDao {
    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);

    //因为有MyBatis不用有实现类
}
