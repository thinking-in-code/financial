package com.jts.manager.controller;

import org.springframework.util.ClassUtils;

/**
 * @author jia ting shuai
 * @date 2019/4/29 12:00
 */
public class TestController {
    public static void main(String[] args) {
        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
        System.out.println(path);
    }
}
