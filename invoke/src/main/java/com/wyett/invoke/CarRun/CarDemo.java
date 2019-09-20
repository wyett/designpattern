package com.wyett.invoke.CarRun;

import java.lang.reflect.Proxy;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/20 15:46
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class CarDemo {
    public static void main(String[] args) {
        Car carimpl = new CarImpl();
        Car proxy = (Car) DynamicCarHandler.getProxy(carimpl);
        proxy.run();
    }
}
