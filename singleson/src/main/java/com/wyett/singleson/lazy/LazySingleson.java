package com.wyett.singleson.lazy;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 17:56
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class LazySingleson {
    private static LazySingleson lazySingleson;
    private LazySingleson() {
        System.out.println("This is a LazySingleson");
    }

    public static LazySingleson getInstance() {
        if (lazySingleson == null) {
            lazySingleson = new LazySingleson();
        }
        return lazySingleson;
    }
}
