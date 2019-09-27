package com.wyett.decorator.HerryPot;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/27 16:02
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class JuniorMagician extends Magician {
    private String name;
    public JuniorMagician(String name) {
        this.name = name;
    }
    @Override
    public void takeMagic() {
        System.out.println("Junior magician can take some easy magic");
    }
}
