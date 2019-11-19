package com.luther.test;

import com.luther.FactoryBean.FactoryTestBean;
import com.luther.FactoryBean.TestBean;
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
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liujie
 * @datetime 2019/10/14 15:58
 */
public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpringProperty bean = annotationConfigApplicationContext.getBean(SpringProperty.class);
		System.out.println(bean);



	}
}

