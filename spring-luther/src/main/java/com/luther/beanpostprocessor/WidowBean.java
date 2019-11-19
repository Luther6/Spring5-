package com.luther.beanpostprocessor;

import com.luther.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @datetime 2019/11/14 15:36
 */
@Component
public class WidowBean {
	@Autowired
	public UserDao userDao;
}
