package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;
	
	@PostMapping(value="/dept/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	}
	
	@GetMapping(value="/dept/list")
	public List<Dept> list() {
		return service.list();
	}
	
	@GetMapping(value="/dept/get/{id}")
	@HystrixCommand(fallbackMethod="hystrixMothod_Get")
	public Dept get(@PathVariable("id")Long id) {
		Dept dept = service.get(id);
		if (null == dept) {
			throw new RuntimeException("抛个异常！");
		}
		return dept;
	}
	
	public Dept hystrixMothod_Get(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id).setDname("该id：" + id + "没有对应的信息！ null-@HystrixCommand")
		.setDb_source("no this dataBase in mySql!");
	}
}
