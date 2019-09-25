package com.wyett.singleson.Simple;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 17:34
 * @description: TODO
 */

public class SimpleSingleson {
    private SimpleSingleson(){
        System.out.println("This is a new SimpleSingleson");
    }
    public static SimpleSingleson getSimpleSingleson(){
        return new SimpleSingleson();
    }
}
