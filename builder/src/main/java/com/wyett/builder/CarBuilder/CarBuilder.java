package com.wyett.builder.CarBuilder;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/24 19:22
 * @description: TODO
 */

public interface CarBuilder {
    void setWheels();
    void setColor();
    void setChassis();
    void setEngine();
    void setShell();
    Car getCarBuilder();
}
