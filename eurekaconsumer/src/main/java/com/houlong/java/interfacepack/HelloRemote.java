package com.houlong.java.interfacepack;

import com.houlong.java.compont.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * Created by houlong on 2018/3/4.
 */

@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class) //name:远程服务名，及spring.application.name配置的名称
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}

