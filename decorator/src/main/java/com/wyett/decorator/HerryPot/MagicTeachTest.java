package com.wyett.decorator.HerryPot;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/27 16:41
 * @description: TODO
 */

public class MagicTeachTest {
    @Test
    public void test() {
        JuniorMagician juniorMagician = new JuniorMagician("HerryPot");
        Albus albus = new Albus(juniorMagician);
        albus.takeMagic();
        albus.teachStudent();
    }
}
