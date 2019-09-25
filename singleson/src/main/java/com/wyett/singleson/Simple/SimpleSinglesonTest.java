package com.wyett.singleson.Simple;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 17:38
 * @description:
 */

public class SimpleSinglesonTest {
    @Test
    public void test() {
        int n = 10;
        while(n-- > 0) {
//            SimpleSingleson simpleSingleson = SimpleSingleson.getSimpleSingleson();
            SimpleSingleson.getSimpleSingleson();
        }
    }
}
