package com.wyett.observer.BlogWatcher;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/17 21:27
 * @description: TODO
 */

public class BlogViewerImpl implements BlogViewerService {
    private String viewer;

    public BlogViewerImpl(String viewer) {
        this.viewer = viewer;
    }

    public void update(String msg) {
        System.out.println(viewer + " recived " + msg);
    }
}
