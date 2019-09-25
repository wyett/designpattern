package com.wyett.singleson.staticinnerclass;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 19:41
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class StaticInnerSinglesonTest {
    @Test
    public void test() {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread1");
                StaticInnerClassSingleson.getInstance();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread2");
                StaticInnerClassSingleson.getInstance();
            }
        };
        thread1.start();
        thread2.start();
    }
}
