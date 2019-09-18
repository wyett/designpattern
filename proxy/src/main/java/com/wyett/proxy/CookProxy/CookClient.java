package com.wyett.proxy.CookProxy;

import java.lang.reflect.Proxy;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/18 20:33
 * @description: TODO
 */

public class CookClient {
    public static void main(String[] args) {
        // static
//        Chef chef = new Husbend();
//        Chef cookProxy = new CookProxy(chef);
//        cookProxy.cook();

        //dynamic
        Chef chef = new Husbend();
        DynamicCookProxy dynamicCookProxy = new DynamicCookProxy(chef);
        Chef husbend = (Chef) Proxy.newProxyInstance(chef.getClass().getClassLoader(),
                new Class[]{Chef.class}, dynamicCookProxy);
        husbend.cook();
    }
}
