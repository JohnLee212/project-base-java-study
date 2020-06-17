package com.java.reflect.domain;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author John Lee
 * @Version 1.0
 * @Description
 * @date 2020/6/17 17:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    public String name;
    private Integer age;

    public void say(){
        System.out.println("Hello " + this.getName());
    }

    public void say(String name){
        System.out.println("Hello " +name);
    }

}
