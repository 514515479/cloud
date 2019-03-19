package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component  //千万不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {

		return new DeptClientService() {
			@Override
			public Dept get(Long id) {
				return new Dept().setDeptno(id).setDname("该id：" + id + "没有对应的信息！consumer提供的降级信息")
						.setDb_source("no this dataBase in mySql!");
			}

			@Override
			public boolean add(Dept dept) {
				
				return false;
			}

			@Override
			public List<Dept> list() {
				
				return null;
			}};
	}

}
