package com.gxa.controller;

import com.gxa.dto.ResultDTO;
import com.gxa.pojo.Admin;
import com.gxa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService ;
/**
 * 登录页面
 */
    @GetMapping("/login/page")
    public  String loginPage(){
    return  "login";
}

    /**
     * 管理员登录的方法
     * @param admin
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public ResultDTO login(Admin admin, HttpSession session){
        return  loginService.login(admin,session);
    }

    /**
     * 退出登录的方法
     */
    @GetMapping("/logout")
    @ResponseBody
    public  ResultDTO logout(HttpSession session){
        session.removeAttribute("admin");
        return  new ResultDTO(200,"退出成功！",null);
    }
}
