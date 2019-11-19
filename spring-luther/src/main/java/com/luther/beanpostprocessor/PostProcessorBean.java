package com.luther.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @author liujie
 * @datetime 2019/11/16 21:52
 */
@Component
public class PostProcessorBean implements InitializingBean,ApplicationContextAware {


	@PostConstruct
	public void show(){
		System.out.println("八月秋高风怒号");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("卷我屋上三重茅");
	}

	@PreDestroy
	public void take(){
		System.out.println("茅飞渡江洒江郊");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("杜甫");
	}
}
