package com.luther.beanfactoryprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 这里传入的Bean工厂就是我们的之前实例化ApplicationContext中的BeanFactory
 * 这里可以在我们即将要初始化我们的Bean,准确一点是在我们初始化我们交给Spring容器管理的类之前做一些初始化动作
*
 *
 *
 *
 * @author liujie
 * @datetime 2019/11/3 11:15
 */
@Component
public class BeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory.getClass());
		System.out.println("#####################");

	}
}
