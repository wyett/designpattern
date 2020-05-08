package com.wyett;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/8 11:52
 * @description: TODO
 */

public class TestListener {
    public static void main(String[] args) {
        WyettListener wyettListener = new WyettListener();
        Wyett wyett = new Wyett();
        // 绑定监听
        wyett.setListener(wyettListener);
        // 事件源调用事件
        wyett.read();
    }
}
