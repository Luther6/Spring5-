package com.luther.pojo;

import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @datetime 2019/10/14 15:57
 */
@Component
public class User {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("???");
	}
}
