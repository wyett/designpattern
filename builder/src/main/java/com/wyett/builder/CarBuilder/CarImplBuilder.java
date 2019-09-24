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
    public void setWhells(){
        car.setWheels("4 whells");
    }

}
