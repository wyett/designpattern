package com.wyett.proxy.DogCglib;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/24 11:52
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class DogService {
    public DogService() {
        System.out.println("Default Constructor DogService");
    }

    public final Dog getDog(String s) {
        System.out.println("Give me a " + s + " dog");
        return null;
    }

    public void setDog() {
        System.out.println("This is a lucky dog");
    }
}
