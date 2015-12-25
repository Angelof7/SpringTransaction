package com.andygc.practice.demo2;


import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by andy on 15/12/23.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    /**
     * 转出
     *
     * @param out   :转出帐号
     * @param money :转出金额
     */
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    /**
     * 转入
     *
     * @param in    :转入帐号
     * @param money :转出金额
     */
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}
