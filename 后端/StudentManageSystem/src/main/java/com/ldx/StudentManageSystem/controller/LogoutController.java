package com.ldx.StudentManageSystem.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class LogoutController {

    @PostMapping("/api/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        if (session != null) {
            // 无效化Session
            session.invalidate();
        }
        // TokenService.removeToken(request, response);

        // 返回成功消息
        return "您已成功退出登录";
    }
}