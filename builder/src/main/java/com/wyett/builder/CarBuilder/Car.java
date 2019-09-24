package com.wyett.builder.CarBuilder;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/24 19:17
 * @description: TODO
 */

@Setter
@Getter
@ToString
public class Car {
    private String wheels;
    private String color;
    private String chassis;
    private String engine;
    private String shell;
}
