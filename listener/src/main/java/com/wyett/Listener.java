package com.wyett;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/8 11:29
 * @description: 监听事件, 并进行处理转发, 必须注册在事件源
 */

public interface Listener {
    void onListener(WyettEvent event);
}
