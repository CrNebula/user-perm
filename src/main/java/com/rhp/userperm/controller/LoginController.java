package com.rhp.userperm.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/doLogin")
    public Map doLogin(String username, String password){
        Map<String,String> map = new HashMap<String, String>();
        map.put("result","success");
        //拿到当前主体对象，用作验证   （从安全工具类中拿到subject）
        Subject subject = SecurityUtils.getSubject();
        //将用户名和密码包装到token中
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        //通过捕获异常来判断用户是否是否可以登录
        try{
            subject.login(token);
        }catch (UnknownAccountException uae){
            map.put("result","用户名不存在");
            System.out.println("用户名不存在");
        }catch (IncorrectCredentialsException ice){
            map.put("result","密码错误");
            System.out.println("密码错误");
        }
        return map;
    }

    @GetMapping("/userAdd")
    public String userAdd(){
        return  "用户添加功能";
    }
    @GetMapping("/userUpdate")
    public String userUpdate(){
        return  "用户添加功能";
    }
    @GetMapping("/articleAdd")
    public String articleAdd(){
        return  "文章发布";
    }
    @GetMapping("/403")
    public String un(){
        return  "没权限";
    }

}
