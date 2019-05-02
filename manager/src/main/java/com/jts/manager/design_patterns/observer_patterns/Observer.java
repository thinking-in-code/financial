package com.jts.manager.design_patterns.observer_patterns;

/**
 * 抽象观察者接口
 *
 * @author jia ting shuai
 * @date 2019/4/30 14:21
 */
public interface Observer {
    /**
     * 更新信息
     * @param message 消息
     */
    void update(String message);
}
