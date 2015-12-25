package com.andygc.practice.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by andy on 15/12/23.
 * 转账接口的具体实现类
 */
public class AccountServiceImpl implements AccountService {
    // 注入转账的Dao的类
    private AccountDao accountDao;

    // 注入事务管理的模版
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * 转账
     *
     * @param from  :转出账户
     * @param to    :转入账户
     * @param money :转账数目
     */
    public void transfer(final String from, final String to, final Double money) {
//        accountDao.outMoney(from, money);
//        int i = 1 / 0;
//        accountDao.inMoney(to, money);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(from, money);
//                int i = 1 / 0;
                accountDao.inMoney(to, money);
            }
        });
    }
}
