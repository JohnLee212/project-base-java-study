package com.java.reflect.service.impl;

import com.java.reflect.service.IAccountService;

/**
 * @author John Lee
 * @Version 1.0
 * @Description
 * @date 2020/6/17 19:13
 */
public class AccountServiceImpl implements IAccountService {
    public void transfer() {
        System.out.println("调用dao层,完成转账主业务.");
    }
}
