package com.controller;

import com.service.Client2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Client2Controller {
    @Value("${spring.application.name}")
    private String name;
    @Value("${server.port}")
    private String port;
    @Autowired
    private Client2Service client2Service;

    @RequestMapping("/FeignTest")
    public Map<String,Object> test(){
        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("port",port);
        map.put("Eureka-Client1",client2Service.getmap());
        return map;
    }

}
