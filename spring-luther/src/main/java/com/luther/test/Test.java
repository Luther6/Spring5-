package com.luther.test;

import com.luther.FactoryBean.FactoryTestBean;
import com.luther.FactoryBean.TestBean;
import com.luther.aop.*;
import com.luther.bean.MethodBean;
import com.luther.bean.MoreMethodBean;
import com.luther.beanpostprocessor.WidowBean;
import com.luther.ciclequote.QuoteA;
import com.luther.config.AppConfig;
import com.luther.dao.UserDao;
import com.luther.dao.UserDao1;
import com.luther.imports.ImportDao;
import com.luther.imports.ImportTestBean;
import com.luther.property.SpringProperty;
import com.luther.web.CusController;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.lang.reflect.Proxy;
import java.util.*;

/**
 * @author liujie
 * @datetime 2019/10/14 15:58
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
//		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
/*		AopConfig bean = annotationConfigApplicationContext.getBean(AopConfig.class);
		bean.aopTestBean();*/

		CusController bean = annotationConfigApplicationContext.getBean(CusController.class);

	}
}

