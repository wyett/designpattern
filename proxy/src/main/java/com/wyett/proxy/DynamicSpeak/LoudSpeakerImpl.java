package com.wyett.proxy.DynamicSpeak;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/20 16:44
 * @description: TODO
 */

public class LoudSpeakerImpl implements Speaker{
    @Override
    public void speak() {
        System.out.println("speak loudly");
    }
}
