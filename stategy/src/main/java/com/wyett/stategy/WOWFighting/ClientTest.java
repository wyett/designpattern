package com.wyett.stategy.WOWFighting;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/26 15:23
 * @description: TODO
 */

public class ClientTest {
    @Test
    public void test() {
        WarriorFighting warriorFighting =
                new WarriorFighting(new WithFireMageFightingStategy());
        warriorFighting.setFightingStategy();
    }
}
