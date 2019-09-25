package com.wyett.singleson.staticinnerclass;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 19:37
 * @description: TODO
 */

public class StaticInnerClassSingleson {
    private static class SinglesonHolder{
        private static StaticInnerClassSingleson staticInnerClassSingleson
                = new StaticInnerClassSingleson();
    }
    private StaticInnerClassSingleson() {}

    public static final StaticInnerClassSingleson getInstance() {
        return new StaticInnerClassSingleson();
    }
}
