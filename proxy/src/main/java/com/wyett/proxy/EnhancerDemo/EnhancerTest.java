package com.wyett.proxy.EnhancerDemo;

import net.sf.cglib.proxy.*;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/24 15:24
 * @description: TODO
 */

public class EnhancerTest {
    @Test
    public void testFixedValue() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloJava.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "love java";
            }
        });
        HelloJava helloJava = (HelloJava) enhancer.create();
        System.out.println(helloJava.test());
        System.out.println(helloJava.toString());
        System.out.println(helloJava.getClass());
//        System.out.println(helloJava.hashCode());
    }

    @Test
    public void testInvocationHandler() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloJava.class);
        enhancer.setCallback(new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                if(method.getDeclaringClass() != Object.class
                        && method.getReturnType() == String.class) {
                    return "love java";
                } else {
                    System.out.println(method.getDeclaringClass());
                    System.out.println(method.getReturnType());
                    throw new RuntimeException("Do not know what to do");
                }
            }
        });
        HelloJava helloJava = (HelloJava) enhancer.create();
        Assert.assertEquals("love java", helloJava.test());
        Assert.assertNotEquals("Hello JAVA", helloJava.toString());
    }

    /**
     * Hello JAVA
     * com.wyett.proxy.EnhancerDemo.HelloJava$$EnhancerByCGLIB$$64707d3f@3d3fcdb0
     * class com.wyett.proxy.EnhancerDemo.HelloJava$$EnhancerByCGLIB$$64707d3f
     * 1027591600
     */
    @Test
    public void testMethodInterceptor() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloJava.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object res = methodProxy.invokeSuper(o, objects);
                return res;
            }
        });
        HelloJava helloJava = (HelloJava) enhancer.create();
        System.out.println(helloJava.test());
        System.out.println(helloJava.toString());
        System.out.println(helloJava.getClass());
        System.out.println(helloJava.hashCode());

    }

    @Test
    public void testCallbackFilter() {
        Enhancer enhancer = new Enhancer();
        CallbackHelper callbackHelper = new CallbackHelper(HelloJava.class,
                new Class[0]) {
            @Override
            protected Object getCallback(Method method) {
                if (method.getDeclaringClass() != Object.class
                        && method.getReturnType() == String.class) {
                    return new FixedValue() {
                        @Override
                        public Object loadObject() throws Exception {
                            return "love java";
                        }
                    };
                } else {
                    return NoOp.INSTANCE;
                }
            }
        };
        enhancer.setSuperclass(HelloJava.class);
        enhancer.setCallbackFilter(callbackHelper);
        enhancer.setCallbacks(callbackHelper.getCallbacks());
        HelloJava helloJava = (HelloJava) enhancer.create();
        Assert.assertEquals("love java", helloJava.test());
        Assert.assertNotEquals("Hello JAVA", helloJava.toString());
        System.out.println(helloJava.hashCode());
    }
}
