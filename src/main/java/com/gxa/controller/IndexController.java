package com.gxa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author:IT-CNLM
 * @date:Created at 2020/08/12
 */
@Controller
public class IndexController {

    /**
     * 后台首页的渲染
     * @return
     */
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 欢迎页面
     * @return
     */
    @GetMapping("/welcome")
    public  String welcome(){
        return  "welcome";
    }
}
