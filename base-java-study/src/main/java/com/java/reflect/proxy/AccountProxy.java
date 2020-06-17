package com.java.reflect.proxy;

import com.java.reflect.service.IAccountService;

/**
 * @author John Lee
 * @Version 1.0
 * @Description
 * @date 2020/6/17 19:14
 */
public class AccountProxy implements IAccountService {

    /**
     * 目标对象
     */
    private IAccountService target;

    public AccountProxy(IAccountService target) {
        this.target = target;
    }

    public void transfer() {
        before();
        target.transfer();
    }

    /**
     * 前置增强
     */
    private void before() {
        System.out.println("对转账人身份进行验证.");
    }
}
