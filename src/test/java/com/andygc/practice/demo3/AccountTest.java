package com.andygc.practice.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 转账案例的测试类-基于aspectJ的xml方式的配置
 * Created by andy on 15/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class AccountTest {
    // 测试业务类
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo3() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
