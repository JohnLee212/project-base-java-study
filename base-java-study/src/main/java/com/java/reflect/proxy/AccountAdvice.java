package com.java.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author John Lee
 * @Version 1.0
 * @Description
 * @date 2020/6/17 19:19
 */
public class AccountAdvice implements InvocationHandler {

    private Object object;

    public AccountAdvice(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        return method.invoke(object, args);
    }

    private void before() {
        System.out.println("对转账人身份进行验证.");
    }
}
