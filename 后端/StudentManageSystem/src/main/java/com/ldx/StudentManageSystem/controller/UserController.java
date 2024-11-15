package com.ldx.StudentManageSystem.controller;


import com.ldx.StudentManageSystem.biz.UserBiz;
import com.ldx.StudentManageSystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserBiz biz;

    @PostMapping("/register")
    public Map register(User user) {
        this.biz.registerUser(user);
        Map result = new HashMap<>();
            // 注册成功，返回成功消息
            result.put("isOk", true);
            result.put("msg", "注册成功");



        return result;
    }

    @RequestMapping("/login")
    public Map userLogin(User user, HttpSession session) {
        Map result = new HashMap();
        user = this.biz.findUser(user);
        if (user != null) {
            session.setAttribute("login_user", user);
            result.put("isOk", true);
            result.put("user", user);
            result.put("msg", "登录成功");
        } else {
            result.put("isOk", false);
            result.put("msg", "登录失败");
        }
        return result;
    }
    @RequestMapping("/update")
    public Map updateUser(User user) {
        Map result = new HashMap<>();
        if (this.biz.updateUser(user)) {
            result.put("isOk", true);
            result.put("msg", "更新成功");
        } else {
            result.put("isOk", false);
            result.put("msg", "更新失败");
        }
        return result;
    }

}