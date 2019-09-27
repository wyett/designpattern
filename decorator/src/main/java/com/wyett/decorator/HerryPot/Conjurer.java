package com.wyett.decorator.HerryPot;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/27 16:09
 * @description: TODO
 */

public abstract class Conjurer extends Magician {
    private Magician magician;
    public Conjurer(Magician magician) {
        this.magician = magician;
    }
    @Override
    public void takeMagic() {
        if(magician != null) {
            magician.takeMagic();
        }
    }
}
