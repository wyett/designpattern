package com.wyett.proxy.DynamicSpeak;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/20 16:48
 * @description: TODO
 */

public class SpeakerProxyFactory {
    private Object target;
    public SpeakerProxyFactory(Object target) {
        this.target = target;
    }

    public Object newProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object handler = method.invoke(target, args);
                        return handler;
                    }
                }
        );
    }
}
