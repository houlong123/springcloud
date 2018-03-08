package com.houlong.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients

//熔断器注释
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableHystrix
public class EurekaconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaconsumerApplication.class, args);
	}
}
