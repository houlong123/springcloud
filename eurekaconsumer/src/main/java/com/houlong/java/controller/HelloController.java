package com.houlong.java.controller;

import com.houlong.java.interfacepack.HelloRemote;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by houlong on 2018/3/4.
 */
@RestController
public class HelloController {

    @Resource
    HelloRemote helloRemote;


    //@HystrixCommand(fallbackMethod = "reliable")
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}
