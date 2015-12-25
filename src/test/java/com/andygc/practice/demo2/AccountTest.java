package com.andygc.practice.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 转账案例的测试类-基于transactionProxyFactoryBean
 * Created by andy on 15/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class AccountTest {
    // 测试业务类
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;

    @Test
    public void demo2() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
