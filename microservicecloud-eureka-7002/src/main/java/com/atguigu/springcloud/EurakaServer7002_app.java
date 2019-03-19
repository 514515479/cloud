package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakaServer7002_app {
	public static void main(String[] args) {
		SpringApplication.run(EurakaServer7002_app.class, args);
	}
}
