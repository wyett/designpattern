package com.wyett.singleson.enumsingleson;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/25 19:57
 * @description: TODO
 */

public class EnumSinglesonTest {
    @Test
    public void test() {
        EnumSingleson.singleson1.getInstance();
    }
}
