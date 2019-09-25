package com.wyett.singleson.hungry;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 17:49
 * @description: TODO
 */

public class HungrySingleson {
    private static HungrySingleson hungrySingleson = new HungrySingleson();

    private HungrySingleson() {
        System.out.println("this is a hungrySingleson");
    }

    public static HungrySingleson getHungrySingleson() {
        return new HungrySingleson();
    }
}
