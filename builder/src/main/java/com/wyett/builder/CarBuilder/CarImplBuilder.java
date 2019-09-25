package com.wyett.builder.CarBuilder;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/24 19:26
 * @description: TODO
 */

public class CarImplBuilder implements CarBuilder {
    private Car car;
    public CarImplBuilder() {
        this.car = new Car();
    }
    @Override
    public void setWheels(){
        car.setWheels("4 wheels");
    }

    @Override
    public void setColor() {
        car.setColor("red");
    }

    @Override
    public void setChassis() {
        car.setChassis("suv");
    }

    @Override
    public void setEngine() {
        car.setChassis("ferrari");
    }

    @Override
    public void setShell() {
        car.setShell("L");
    }

    @Override
    public Car getCarBuilder() {
        return car;
    }
}
