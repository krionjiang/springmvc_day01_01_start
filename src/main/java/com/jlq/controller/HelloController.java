package com.jlq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/16 20:38
 * 控制器类
 */

@Controller
@RequestMapping("/user")
public class HelloController {

    /**
     * 入门案例
     * @return
     */
    @RequestMapping(path = "/hello")
    public String SayHello(){
        System.out.println("hello StringMVC");
        return "success";
    }

    /**
     * 测试RequestMapping注解
     * @return
     */
    @RequestMapping(path = "/testRequestMapping",headers = "Cookie")
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解...");
        return "success";
    }

}


