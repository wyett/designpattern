package com.wyett.decorator.NetLayer;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/27 15:36
 * @description: TODO
 * @modified By:
 * @version: $
 */

public class LayerTest {
    @Test
    public void test() {
        String message = "this is a test message";
        ApplicationLayerImpl appLayer = new ApplicationLayerImpl(message);
        appLayer.send();
        TransportLayerImpl transLayer =
                new TransportLayerImpl(new TransportLayer(appLayer), message);
        transLayer.send();

    }
}
