package com.wyett.decorator.NetLayer;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/27 14:53
 * @description: TODO
 */

public class ApplicationLayerImpl implements Layer{
    private String message;
    public ApplicationLayerImpl(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Application Layer: " + message);
    }
}
