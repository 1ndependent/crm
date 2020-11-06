package com.xxxx.crm.controller;

import com.xxxx.crm.base.BaseController;
import com.xxxx.crm.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {
    @Autowired
    private Userservice userService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }


    @RequestMapping("main")
    public String main(){
        return "main";
    }

    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }

}
