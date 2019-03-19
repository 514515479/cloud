package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DepatConsumer_DashBoard_App {
	public static void main(String[] args) {
		SpringApplication.run(DepatConsumer_DashBoard_App.class, args);
	}
}
