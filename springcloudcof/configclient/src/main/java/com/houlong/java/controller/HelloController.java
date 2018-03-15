package com.houlong.java.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by houlong on 2018/3/8.
 */
@RestController
@RefreshScope   // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class HelloController {

    @Value("${enviment}")
    private String envimen;

    @GetMapping(value = "/enviment")
    public String getEnvimentFromConfig() {
        return this.envimen;
    }
}
