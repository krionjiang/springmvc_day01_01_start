package com.jlq.controller;

import com.jlq.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/18 15:54
 * 常用的注解
 */

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})  //把msg=美美存到session域对象中
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
    public String testModeAttribute( @ModelAttribute("user01")User user){
        System.out.println("testModeAttribute执行了..."+user);
        return "success";
    }


    @ModelAttribute
    public void ShowUser(String username,Map<String,User> map) {
        System.out.println("showUser执行了...");
        //通过用户名查询数据库(模拟)
        User user = new User();
        user.setUsername(username);
        user.setAge(20);
        user.setDate(new Date());
        map.put("user01",user);
    }

    /**
     * 该方法先执行
     */
/*    @ModelAttribute
    public User ShowUser(String username) {
        System.out.println("showUser执行了...");
        //通过用户名查询数据库(模拟)
        User user = new User();
        user.setUsername(username);
        user.setAge(20);
        user.setDate(new Date());
        return user;
    }*/


    /**
     * SessionAttributes注解
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("SessionAttributes执行了...");
        //底层会存储到request域对象中
        model.addAttribute("msg","菜菜");
        return "success";
    }

    /**
     * 从Session域中获取值
     * @param model
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(Model model){
        System.out.println("getSessionAttributes执行了...");
        //底层会存储到request域对象中
        String msg =(String)model.getAttribute("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 删除session
     * @param status
     * @return
     */
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("delSessionAttributes执行了...");
        status.setComplete();
        return "success";
    }



}


