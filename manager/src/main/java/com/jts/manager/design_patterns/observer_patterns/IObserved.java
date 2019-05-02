package com.jts.manager.design_patterns.observer_patterns;

/**
 * 抽象被观察者接口
 * @author jia ting shuai
 * @date 2019/4/30 14:21
 */
public interface IObserved {
    /**
     * 注册
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 删除
     */
    void removeObserver(Observer o);

    /**
     * 通知所有注册的观察者
     */
    void notifyObserver();

}
