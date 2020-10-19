package com.jlq.controller;

import com.jlq.domain.Account;
import com.jlq.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/18 14:35
 * 请求参数绑定
 */

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam (String username,String password){
        System.out.println("请求参数绑定执行了...");
        System.out.println("你的用户名:"+username+"以及密码:"+password);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("封装了:"+account);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("封装了:"+user);
        return "success";
    }

    /**
     * 原生的API
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("testServlet执行了...");
        System.out.println(request+":"+response);
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        return "success";
    }

}


