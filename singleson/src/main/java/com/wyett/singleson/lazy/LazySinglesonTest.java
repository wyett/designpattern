package com.wyett.singleson.lazy;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 17:59
 * @description: TODO
 */

public class LazySinglesonTest {
    @Test
    public void test() {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                LazySingleson.getInstance();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                LazySingleson.getInstance();
            }
        };
        thread1.start();
        thread2.start();
    }
}
