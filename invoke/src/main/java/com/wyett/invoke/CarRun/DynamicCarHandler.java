package com.wyett.invoke.CarRun;

import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/20 12:13
 * @description: TODO
 */

public class DynamicCarHandler implements InvocationHandler {
    private Object o;
    public DynamicCarHandler(Object o) {
        this.o = o;
    }

    public static Object getProxy(Object o) {
        DynamicCarHandler dynamicCar = new DynamicCarHandler(o);
        Object proxy = Proxy.newProxyInstance(o.getClass().getClassLoader(),
                o.getClass().getInterfaces(), dynamicCar);
        return proxy;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] obj) throws Throwable{
        CarUtil.gas();
        method.invoke(o, obj);
        return null;
    }
}
