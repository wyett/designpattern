package com.wyett.singleson.enumsingleson;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 19:51
 * @description: TODO
 */

public enum EnumSingleson {
    // instance
    singleson1;

    private EnumSingleson() {
        System.out.println("This is a singleson");
    }

    public void getInstance() { }
}
