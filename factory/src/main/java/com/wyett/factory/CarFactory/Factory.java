package com.wyett.factory.CarFactory;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/23 20:38
 * @description: TODO
 */

public interface Factory {
    <T extends Car> T createCar(Class<T> c);
}
