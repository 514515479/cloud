package com.atguigu.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced  //Ribbon负载均衡（默认轮询）
	public RestTemplate geTemplate() {
		return new RestTemplate();
	}
	
	/*@Bean
	public IRule myRule() {
		return new RandomRule(); //用我们选择的随机算法替换默认的轮询算法
	} */
}
