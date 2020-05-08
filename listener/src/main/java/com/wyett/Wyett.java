package com.wyett;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/8 11:32
 * @description: 事件源
 */

public class Wyett {
    Listener listener;

    /**
     * 注册监听
     * @param listener
     */
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void read() {
        if (listener != null) {
            // 绑定事件
            WyettEvent wyettEvent = new WyettEvent();
            wyettEvent.setWyett(this);
            listener.read(wyettEvent);
        }
    }
}
