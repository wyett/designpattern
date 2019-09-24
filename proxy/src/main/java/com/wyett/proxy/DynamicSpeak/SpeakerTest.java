package com.wyett.proxy.DynamicSpeak;


import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/20 16:55
 * @description: TODO
 */

public class SpeakerTest {
    @Test
    public void test() {
        Speaker speaker = new LoudSpeakerImpl();
        Speaker proxy = (Speaker) new SpeakerProxyFactory(speaker).newProxyInstance();
        proxy.speak();
    }
}
