package com.houlong.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by houlong on 2018/3/6.
 */
@RestController
public class HelloController {

    @GetMapping(name = "/hello")
    public String index(@RequestParam String name) {
        System.out.println("服务提供商2");

        System.out.println("request two name is "+name);
        /*try{
            Thread.sleep(1000000);
        }catch ( Exception e){
            System.out.println(" hello two error" + e);
        }*/
        return "hello " + name + ", 服务提供商2提供服务";
    }
}
