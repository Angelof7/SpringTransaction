#spring事务总结
================
##spring将事务分成了两类:
1, 编程式事务管理
    `手动编写代码进行事务管理（很少使用）`
2, 声明式事务管理
    *基于TransactionProxyFactoryBean的方式（很少使用）
    `需要为每个进行事务管理的类，配置一个TransactionProxyFactoryBean进行增强`
    *基于AspectJ的XML方式（经常使用）
    `一旦配置好后，类上不需要添加任何东西`
    *基于注解的方式
    `配置简单，需要在业务层上类添加一个@Transactionl的注解`