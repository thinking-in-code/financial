package com.jts.manager.design_patterns.observer_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jia ting shuai
 * @date 2019/4/30 14:26
 */
public class WechatServer implements IObserved {
    /**
     * list存的是接口，面向接口编程，而不是面向对象编程
     */
    private List<Observer> list;

    private String message;

    public WechatServer(){
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!list.isEmpty()){
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        list.forEach( observer -> {
            observer.update(message);
        });
    }

    public void setMessage(String message){
        this.message = message;
        System.out.println("更新的消息是->"+message);
        notifyObserver();
    }
}
