package com.wyett.factory.CarFactory;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/18 11:01
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class BmwCar extends Car {
    @Override
    public Car getCar() {
        return new BmwCar();
    }
}
