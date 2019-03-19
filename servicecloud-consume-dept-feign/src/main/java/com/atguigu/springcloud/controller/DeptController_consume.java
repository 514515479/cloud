package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;

@RestController
public class DeptController_consume {

	@Autowired
	private DeptClientService service;
	
	@PostMapping(value="/consumer/dept/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	}
	
	@GetMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id")Long id) {
		return service.get(id);
	}
	
	@GetMapping(value="/consumer/dept/list")
	public List<Dept> list() {
		System.err.println("11111");
		return service.list();
	}
}
