package com.wyett.template.ShipBuild;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/29 14:41
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class LNGShip extends Ship {
    @Override
    public void steelPlate() {
        System.out.println("LNG ship needs cool-roll steel sheets");
    }
    @Override
    public void engine() {
        System.out.println("LNG ship needs diesel engine");
    }
    @Override
    public void shipMethod() {
        System.out.println("section fabrication");
    }
}
