package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Client1Controller {

    @Value("${spring.application.name}")
    private String name;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public Map<String,Object> client1Test(){
        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("port",port);
        return map;
    }


}
