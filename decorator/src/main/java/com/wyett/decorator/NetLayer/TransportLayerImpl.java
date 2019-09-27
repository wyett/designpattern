package com.wyett.decorator.NetLayer;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/27 15:14
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class TransportLayerImpl extends TransportLayer{
    private String message;
    public TransportLayerImpl(TransportLayer transportLayer, String message) {
        super(transportLayer);
        this.message = message;
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Transport layer: " + message);
    }
}
