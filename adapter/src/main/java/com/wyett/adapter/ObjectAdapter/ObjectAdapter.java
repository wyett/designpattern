package com.wyett.adapter.ObjectAdapter;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/26 18:59
 * @description: TODO
 */

public class ObjectAdapter implements ObjectTarget {
    private ObjectAdaptee objectAdaptee;
    public ObjectAdapter(ObjectAdaptee objectAdaptee) {
        this.objectAdaptee = objectAdaptee;
    }

    @Override
    public void sayHiToTarget() {
        objectAdaptee.sayHiToAdaptee();
    }
}
