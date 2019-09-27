package com.wyett.decorator.NetLayer;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/27 14:55
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class TransportLayer implements Layer{
    private Layer layer;
    public TransportLayer(Layer layer) {
        this.layer = layer;
    }

    @Override
    public void send(){
        if (layer != null) {
            layer.send();
        }
    }
}
