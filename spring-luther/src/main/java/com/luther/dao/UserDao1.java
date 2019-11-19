package com.luther.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.beans.ConstructorProperties;
import java.util.Arrays;

/**
 * @author liujie
 * @datetime 2019/11/6 14:29
 */
@Component
public class UserDao1 implements InitializingBean {

	@Autowired
	public UserDao userDaoA;

	public UserDao userDao;
	public UserDao2 userDao2;

	@Autowired(required = false)
	public UserDao1(UserDao userDao) {
		System.out.println("1111111111111");
		this.userDao = userDao;
	}
	@Autowired(required = false)
	public UserDao1(UserDao userDaoA, UserDao2 userDao2B) {
		System.out.println("2222222222222222");
		System.out.println("----------   "+userDao);
		System.out.println("------------   "+userDao2);
		this.userDao = userDaoA;
		this.userDao2 = userDao2B;


	}
	/*
	@ConstructorProperties(value = {"hello","world"})
	public UserDao1(String name1,String name2) {
		System.out.println(name1 + "-------" + name2);
	}
*/
	@PostConstruct
	public static void show(){

		System.out.println("=============++++++++++++++=============");
	}

	@Autowired
	public void show1(UserDao userDao){}


	public static void main(String[] args) {
		Arrays.stream(UserDao1.class.getDeclaredConstructors()).forEach(System.out::println);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-------------------000000000000-------------");
	}
}
