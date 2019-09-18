package com.wyett.observer.BlogWatcher;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/17 21:11
 * @description:
 */

public interface BlogMasterService {
    public void registeObserver(BlogViewerService b);
    public void removeObserver(BlogViewerService b);
    public void notifyObserver();
}
