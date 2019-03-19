package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
//@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true) //链式
public class Dept implements Serializable{
	private Long 	deptno;
	private String 	dname;
	private String 	db_source;
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	
	public static void main(String[] args) {
		Dept dept = new Dept();
		//链式
		//dept.setDeptno(11L).setDb_source("table").setDname("name");
	}
	
}
