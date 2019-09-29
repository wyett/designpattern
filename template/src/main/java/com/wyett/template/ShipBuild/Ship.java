package com.wyett.template.ShipBuild;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/29 14:29
 * @description: TODO
 */

public abstract class Ship {
    public void shipBuilding() {
        steelPlate();
        innerShell();
        outShell();
        shipMethod();
        engine();
        varnish();
    }
    public abstract void steelPlate();
    public void outShell() {
        System.out.println("creating out shell pear");
    }
    public void innerShell() {
        System.out.println("creating inner shell pear");
    }
    public abstract void engine();
    public void varnish() {
        System.out.println("paint varnish on the outer shell");
    }
    public abstract void shipMethod();
}
