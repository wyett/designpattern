package com.wyett.template.ShipBuild;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/29 15:30
 * @description: TODO
 */

public class ShipBuildDemo {
    @Test
    public void test() {
        LNGShip lngShip = new LNGShip();
        lngShip.shipBuilding();
        PanamaxShip panamaxShip = new PanamaxShip();
        panamaxShip.shipBuilding();
    }
}
