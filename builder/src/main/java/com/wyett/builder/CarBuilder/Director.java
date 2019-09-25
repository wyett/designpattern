package com.wyett.builder.CarBuilder;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 10:51
 * @description: TODO
 */

public class Director {
    private CarBuilder carBuilder;
    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void createCar() {
        carBuilder.setChassis();
        carBuilder.setColor();
        carBuilder.setEngine();
        carBuilder.setShell();
        carBuilder.setWheels();
    }

    public Car getCar() {
        return carBuilder.getCarBuilder();
    }
}
