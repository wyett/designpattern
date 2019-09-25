package com.wyett.singleson.safethread;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 18:13
 * @description: TODO
 */

public class SafeThreadLazySingleson {
        private volatile static SafeThreadLazySingleson lazySingleson;
        private SafeThreadLazySingleson() {
            System.out.println("This is a LazySingleson");
        }

        public static SafeThreadLazySingleson getInstance() {
            if (lazySingleson == null) {
                synchronized (SafeThreadLazySingleson.class) {
                    if(lazySingleson == null) {
                        lazySingleson = new SafeThreadLazySingleson();
                    }
                }
            }
            return lazySingleson;
        }
}
