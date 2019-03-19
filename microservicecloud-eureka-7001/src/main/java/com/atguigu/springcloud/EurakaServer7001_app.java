package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakaServer7001_app {
	public static void main(String[] args) {
		SpringApplication.run(EurakaServer7001_app.class, args);
	}
}
