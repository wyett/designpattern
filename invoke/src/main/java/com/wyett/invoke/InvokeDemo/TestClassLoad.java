package com.wyett.invoke.InvokeDemo;

import java.lang.reflect.Method;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/19 15:21
 * @description: TODO
 */

public class TestClassLoad {
    public static void main(String[] args) throws Exception {
        // loading and connect
        Class<?> clz = Class.forName("A");
        // connect and init
        Object o = clz.newInstance();
        // get method from class
        Method m = clz.getDeclaredMethod("hello", String.class);
        // invoke
        m.invoke(o);
    }
}
