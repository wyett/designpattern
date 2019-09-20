package com.wyett.proxy.DynamicSpeak;


/**
 * @author : wyettLei
 * @date : Created in 2019/9/20 16:55
 * @description: TODO
 */

public class SpeakerTest {
    public static void main(String[] args) {
        Speaker speaker = new LoudSpeakerImpl();
        Speaker proxy = (Speaker) new SpeakerProxyFactory(speaker).newProxyInstance();
        proxy.speak();
    }
}
