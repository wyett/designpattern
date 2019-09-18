package com.wyett.observer.BlogWatcher;

import java.util.Iterator;
import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/17 21:19
 * @description: TODO
 */

public class BlogMasterImpl {
    private List<BlogViewerService> lb;
    private String msg;

    public BlogMasterImpl(String msg) {
        this.msg = msg;
    }

    public void registeObserver(BlogViewerService blogViewerService) {
        lb.add(blogViewerService);
    }

    public void removeObserver(BlogViewerService blogViewerService) {
        if (!lb.isEmpty()) {
            lb.remove(blogViewerService);
        }
    }

    public void notifyObserver() {
        Iterator<BlogViewerService> lbtor = lb.iterator();
        while (lbtor.hasNext()) {
            lbtor.next().update(msg);
        }
    }
}
