package com.wyett.decorator.HerryPot;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/27 16:11
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class Albus extends Conjurer {
    public Albus(Magician magician) {
        super(magician);
    }

    public void teachStudent() {
        System.out.println("Albus teach student senior magic");
    }

    @Override
    public void takeMagic() {
        super.takeMagic();
    }
}
