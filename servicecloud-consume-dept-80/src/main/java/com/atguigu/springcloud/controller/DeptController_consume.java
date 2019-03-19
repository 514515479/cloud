package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;

@RestController
public class DeptController_consume {

	@Autowired
	private RestTemplate restTemplate;
	
	//private static final String URL = "http://localhost:8001";
	private static final String URL = "http://MICROSERVICECLOUD-DEPT";
	
	@PostMapping(value="/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(URL + "dept/add", dept, Boolean.class);
	}
	
	@GetMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id")Long id) {
		return restTemplate.getForObject(URL + "/dept/get/" + id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(URL + "/dept/list", List.class);
	}
}
