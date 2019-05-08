package com.jts.manager;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * 为什么之前的项目没加@EntityScan也能跑，是因为它们是单一的模块，而这个ManagerApp,
 * 只能扫描到自己的com.jts.manager下面，需要需要额外加@EntityScan注解才可以。
 * 并且在实体类上也要加 @Entity
 * @author jia ting shuai
 * @date 2019/4/22 20:34
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.jts.entity"})
public class ManagerApp {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApp.class, args);
    }
}
