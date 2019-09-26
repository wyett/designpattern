package com.wyett.adapter.ClassAdapter;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/26 18:50
 * @description: TODO
 */

public class Adapter extends Adatpe implements Target{
    @Override
    public void sayTarget() {
        super.sayAdaptee();
    }
}
