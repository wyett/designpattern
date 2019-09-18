package com.wyett.proxy.CookProxy;

import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/18 20:58
 * @description: TODO
 */

public class DynamicCookProxy implements InvocationHandler {
    private Object o;
    public DynamicCookProxy(Object o) {
        this.o = o;
    }

    public Object invoke(Object p, Method m, Object[] obj) throws Throwable {
        Object res = m.invoke(o, obj);
        if("cook".equals(m.getName())) {
            System.out.println("cooking");
        }
        return res;
    }
}
