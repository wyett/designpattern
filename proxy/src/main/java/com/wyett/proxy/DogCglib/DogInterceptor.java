package com.wyett.proxy.DogCglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/24 11:58
 * @description: TODO
 */

public class DogInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object sub, Method method, Object[] obj,
                              MethodProxy methodProxy) throws Throwable {
        System.out.println("dog wang wang...");
        Object object = methodProxy.invokeSuper(sub, obj);
        System.out.println("dog wang wang...");
        return object;
    }
}
