package com.wyett.chainofresponsiblity.SchedulerHandler;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/30 10:30
 * @description: TODO
 * @modified By:
 * @version: $
 */

public abstract class SchedulerHandler {
    private boolean isDeal;
    public SchedulerHandler(boolean isDeal) {
        this.isDeal = isDeal;
    }

    private SchedulerHandler nextHandler;
    public void setNextHandler(SchedulerHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handleRequest();
}
