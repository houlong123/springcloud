package com.houlong.java;

import com.houlong.java.interceptor.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class CloudzuulApplication {

	//将TokenFilter加入到请求拦截队列
	@Bean
	public TokenFilter getTokenFilter() {
		return new TokenFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudzuulApplication.class, args);
	}
}
