package com.wyett.proxy.DogCglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/24 12:09
 * @description: TODO
 */

public class DogTest {
    @Test
    public void test() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "H:\\tmp\\dogservice");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(DogService.class);
        enhancer.setCallback(new DogInterceptor());
        DogService proxy = (DogService) enhancer.create();
        proxy.setDog();
        proxy.getDog("er gou");
    }
}
