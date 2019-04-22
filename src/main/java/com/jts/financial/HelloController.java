package com.jts.financial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jia ting shuai
 * @date 2019/4/22 14:57
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,gradle";
    }
}
