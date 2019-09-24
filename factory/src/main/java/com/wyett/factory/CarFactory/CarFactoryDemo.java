package com.wyett.factory.CarFactory;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/24 10:28
 * @description: TODO
 */

public class CarFactoryDemo {
    @Test
    public void test() {
        CarFactory carFactory = new CarFactory();
        System.out.println(carFactory.createCar(BenzCar.class));
        System.out.println(carFactory.createCar(BmwCar.class));
    }
}
