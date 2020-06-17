package com.java.reflect.controller;

import com.java.reflect.domain.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author John Lee
 * @Version 1.0
 * @Description
 * @date 2020/6/17 17:21
 */
public class TestController {

    public static void main(String[] args) throws Exception {
        // 第一种
        Class<?> clazz = Class.forName("com.java.reflect.domain.User");
        // 第二种
        Class<?> clazz2 = User.class;
        // 第三种
        User user = new User();
        Class<?> clazz3 = user.getClass();

        User user1 = (User) clazz.newInstance();

        Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?> constructor = clazz.getConstructor();
        User o = (User) constructor.newInstance();

        Constructor<?> constructor1 = clazz.getConstructor(String.class, Integer.class);
        User liwenxing = (User) constructor1.newInstance("liwenxing", 25);

        Field name = clazz.getField("name");
        name.set(liwenxing,"John Lee");
        System.out.println(liwenxing);

        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(liwenxing,27);

        System.out.println(liwenxing);

        Method say = clazz.getDeclaredMethod("say");
        say.setAccessible(true);
        say.invoke(liwenxing);

        Method say1 = clazz.getDeclaredMethod("say", String.class);
        say1.invoke(liwenxing,"TOM");
    }
}
