package com.jts.manager.controller;

import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jia ting shuai
 * @date 2019/4/29 12:00
 */
@RestController
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "world";
    }
}
