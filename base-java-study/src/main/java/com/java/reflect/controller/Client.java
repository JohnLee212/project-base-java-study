package com.java.reflect.controller;

import com.java.reflect.proxy.AccountAdvice;
import com.java.reflect.proxy.AccountProxy;
import com.java.reflect.service.IAccountService;
import com.java.reflect.service.impl.AccountServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author John Lee
 * @Version 1.0
 * @Description
 * @date 2020/6/17 19:16
 */
public class Client {

    public static void main(String[] args) {
       /* //创建目标对象
        IAccountService target = new AccountServiceImpl();
        //创建代理对象
        AccountProxy proxy = new AccountProxy(target);
        proxy.transfer();*/
        IAccountService target = new AccountServiceImpl();
        IAccountService o = (IAccountService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new AccountAdvice(target));
        o.transfer();
    }
}
