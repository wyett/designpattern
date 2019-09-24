package com.wyett.factory.CarFactory;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/23 20:41
 * @description: TODO
 */

public class CarFactory implements Factory{
    @Override
    public <T extends Car> T createCar(Class<T> c) {
        Car car = null;
        String carStr = c.getName();
        try {
            car = (Car)Class.forName(carStr).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)car;
    }
}
