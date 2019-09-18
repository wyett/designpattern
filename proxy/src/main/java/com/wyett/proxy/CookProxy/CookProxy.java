package com.wyett.proxy.CookProxy;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/18 20:29
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class CookProxy implements Chef {
    private Chef chef;
    public CookProxy(Chef chef) {
        this.chef = chef;
    }

    public void cook() {
        chef.cook();
    }
}
