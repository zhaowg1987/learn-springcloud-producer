package com.jkfq.serviceproducer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @Author
 * @create 2019-01-23
 **/

@Slf4j
@RestController
public class ProducerController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        /*try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            log.error("线程等待测试...",e);
        }*/
        log.info("欢迎服务提供者。。。");
        return "hello "+name+"，this is new world";
    }

    @RequestMapping("/login/login")
    public String login(@RequestParam String name) {
        log.info("服务提供者2。。。登录");
        return "login "+name+"，this is new world";
    }

}
