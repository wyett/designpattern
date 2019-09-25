package com.wyett.builder.CarBuilder;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 10:56
 * @description: TODO
 */

public class CarBuilderTest {
    @Test
    public void test() {
        Director director = new Director(new CarImplBuilder());
        director.createCar();
        System.out.println(director.getCar());
    }
}
