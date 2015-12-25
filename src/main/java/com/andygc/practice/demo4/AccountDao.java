package com.andygc.practice.demo4;

/**
 * Created by andy on 15/12/23.
 * 转账案例的Dao层接口
 */
public interface AccountDao {
    /**
     * 转出金额
     * @param out   :转出帐号
     * @param money :转出金额
     */
    void outMoney(String out, Double money);

    /**
     * 转入金额
     * @param in    :转入帐号
     * @param money :转出金额
     */
    void inMoney(String in, Double money);
}
