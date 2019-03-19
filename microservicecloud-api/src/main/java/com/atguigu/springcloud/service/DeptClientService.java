package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.springcloud.entities.Dept;

@FeignClient(value="MICROSERVICECLOUD-DEPT", fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	
	//@RequestMapping(value="/dept/add", method=RequestMethod.POST)
	@PostMapping(value="/dept/add")
	public boolean add(Dept dept);
	
	//@RequestMapping(value="/dept/get/{id}", method=RequestMethod.GET)
	@GetMapping(value="/dept/get/{id}")
	public Dept get(@PathVariable("id")Long id);
	
	//@RequestMapping(value="/dept/list", method=RequestMethod.GET)
	@GetMapping(value="/dept/list")
	public List<Dept> list();
}
