package com.houlong.java.compont;

import com.houlong.java.interfacepack.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断器功能添加，实现快速失败。 此处的类，相当于降级操作。当在调用远程应用出现异常时，会回调此类中的相应方法
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+ "， 这是失败返回信息ddd";
    }
}
