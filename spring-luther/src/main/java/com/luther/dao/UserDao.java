package com.luther.dao;

import com.luther.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author liujie
 * @datetime 2019/11/2 18:53
 */
@Component
public class UserDao {
	@Autowired(required = false)
	public UserDao1 userDao1A;

	/*@Autowired(required = false)
	public UserDao(User user) {
	}*/

	@Autowired(required = false)
	public UserDao() {
		System.out.println("构造方法在生成");
	}

	public void query(){
		System.out.println("query info");
	}
}
