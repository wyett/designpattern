package com.wyett.singleson.safethread;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 18:16
 * @description: TODO
 */

public class SafeThreadLazySinglesonTest {
    @Test
    public void test() {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread1");
                SafeThreadLazySingleson.getInstance();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread2");
                SafeThreadLazySingleson.getInstance();
            }
        };
        thread1.start();
        thread2.start();
    }
}
