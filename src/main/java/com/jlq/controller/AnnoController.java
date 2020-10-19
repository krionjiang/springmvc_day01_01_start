package com.jlq.controller;

import com.jlq.domain.User;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/18 15:54
 * 常用的注解
 */

@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String username){
        System.out.println("testRequestParam执行了..."+username);
        return "success";
    }

    /**
     * 获取到请求体的内容
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("testRequestParam执行了..."+body);
        return "success";
    }

    /**
     * @PathVariable 注解演示
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}",method = RequestMethod.GET)
    public String testPathVariable(@PathVariable(value = "sid") String id,@CookieValue("JSESSIONID") String cookieValue){
        System.out.println("testRequestParam执行了..."+id);
        System.out.println(cookieValue);
        return "success";
    }


    /**
     * @ModeAttribute 注解演示
     * @return
     */
    @RequestMapping(value = "/testModeAttribute")
    public String testModeAttribute(User user){
        System.out.println("testModeAttribute执行了..."+user);
        return "success";
    }

    /**
     * 该方法先执行
     */
    @ModelAttribute
    public User ShowUser(String username) {
        System.out.println("showUser执行了...");
        //通过用户名查询数据库(模拟)
        User user = new User();
        user.setUsername(username);
        user.setAge(20);
        user.setDate(new Date());
        return user;
    }



}


