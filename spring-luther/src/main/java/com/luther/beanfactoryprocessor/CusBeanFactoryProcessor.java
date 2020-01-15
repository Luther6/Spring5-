package com.luther.beanfactoryprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 自定义的BeanFactoryPostProcessor自定义并不是自己写的而是我们自己通过调用AnnotationConfigApplicationContext.addBeanFactoryPostProcessor()
 * 其中维护了一个beanFactoryPostProcessor list集合
 * 而不管你是否添加了@Component注解
 *
 *
 *
 * @author liujie
 * @datetime 2019/11/4 18:39
 */
@Component
public class CusBeanFactoryProcessor  implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Cus BeanFactoryProcessor");
	}
}
