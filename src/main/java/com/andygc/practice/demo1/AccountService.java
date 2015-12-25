package com.andygc.practice.demo1;

/**
 * Created by andy on 15/12/23.
 * 转账案例的业务层接口
 */
public interface AccountService {
    /**
     * 转账
     * @param from  :转出账户
     * @param to    :转入账户
     * @param money :转账数目
     */
    void transfer(String from, String to, Double money);
}
