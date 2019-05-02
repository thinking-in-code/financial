package com.jts.manager.design_patterns.observer_patterns;

/**
 * @author jia ting shuai
 * @date 2019/4/30 14:36
 */
public class App {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer xiaoqiao = new User("xiaoqiao");
        Observer daqiao = new User("daqiao");
        Observer sunshangxiang = new User("sunshangxiang");
        Observer huangyueying = new User("huangyueying");
        Observer zhugenu = new User("zhugenu");

        server.registerObserver(xiaoqiao);
        server.registerObserver(daqiao);
        server.registerObserver(sunshangxiang);
        server.registerObserver(huangyueying);

        server.setMessage("无限杀");
        System.out.println("---------------------------------------");
        server.removeObserver(xiaoqiao);
        server.setMessage("取消诸葛弩");


    }
}
