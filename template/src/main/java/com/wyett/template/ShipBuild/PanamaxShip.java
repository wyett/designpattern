package com.wyett.template.ShipBuild;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/29 14:55
 * @description: TODO
 */

public class PanamaxShip extends Ship {
    @Override
    public void steelPlate() {
        System.out.println("PAJAMAX needs cool-roll steel sheets"); }
    @Override
    public void engine() {
        System.out.println("Pajamax ship needs diesel engine");
    }
    @Override
    public void shipMethod() {
        System.out.println("Giant total section shipbuilding ");
    }
}
