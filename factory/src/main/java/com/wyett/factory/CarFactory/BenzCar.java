package com.wyett.factory.CarFactory;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/18 11:02
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class BenzCar extends Car {
    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
