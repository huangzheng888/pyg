package com.pinyougou.shop.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录请求处理器
 */

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("info")
    public Map<String,Object> name(){
        //从springSecurity中获取登录名
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map<String, Object> map = new HashMap<>();
        map.put("loginName",name);
        return map;
    }
}
