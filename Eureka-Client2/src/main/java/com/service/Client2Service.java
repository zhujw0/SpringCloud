package com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(value = "eureka-client1")  //Eureka-Client1项目中的 spring.application.name
public interface Client2Service {

    //因为 eureka-client1 项目配置了server.servlet.context-path=client1   下面路径加上client1
    @RequestMapping("client1/test")
    public Map<String,Object> getmap();

}
