package com.houlong.java.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by houlong on 2018/3/8.
 */
@RestController
public class HelloController {

    @Value("${enviment}")
    private String envimen;

    @GetMapping(value = "/enviment")
    public String getEnvimentFromConfig() {
        return this.envimen;
    }
}
