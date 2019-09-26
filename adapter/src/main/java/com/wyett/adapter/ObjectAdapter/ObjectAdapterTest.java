package com.wyett.adapter.ObjectAdapter;

import org.junit.Test;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/26 19:01
 * @description: TODO
 */

public class ObjectAdapterTest {
    @Test
    public void test() {
        ObjectTarget objectTarget = new ObjectAdapter(new ObjectAdaptee());
        objectTarget.sayHiToTarget();
    }
}
