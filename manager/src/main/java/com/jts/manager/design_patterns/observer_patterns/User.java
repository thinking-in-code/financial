package com.jts.manager.design_patterns.observer_patterns;

/**
 * 定义具体的观察者
 * @author jia ting shuai
 * @date 2019/4/30 14:33
 */
public class User implements Observer{
    private String name;

    private String message;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name+" 收到的推送消息："+message);
    }

}
