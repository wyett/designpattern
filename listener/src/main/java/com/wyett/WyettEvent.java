package com.wyett;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/8 11:31
 * @description: 事件对象，在事件源和监听之间传递信息
 */

public class WyettEvent {
    private Wyett wyett;

    public Wyett getWyett() {
        return wyett;
    }

    /**
     * 封装事件源
     * @param wyett
     */
    public void setWyett(Wyett wyett) {
        this.wyett = wyett;
    }
}
