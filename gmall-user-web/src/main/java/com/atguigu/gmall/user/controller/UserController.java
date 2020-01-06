package com.atguigu.gmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "user index";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList = userService.getAllUser();
        return umsMemberList;
    }
}
