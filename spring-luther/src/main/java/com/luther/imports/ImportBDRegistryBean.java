package com.luther.imports;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.Proxy;

/**
 *	这个接口的实现也是主要为了向我们的Spring容器中注入一个bean。
 *	这里与ImportSelector接口的区别是:这里方法的参数传入了一个BeanDefinitionRegistry,也就是说可以由我们手动的来注册一个Bean,
 *	那么为什么需要手动的注册Bean呢?有这么一种情况,就是你的Bean对应的类可能并不存在于你的真实文件系统中,比如动态代理产生的对象,
 *	1、首先你无法获取到他的类，因为动态代理产生的对象不存在于磁盘上。 所以使用这样的方法来做。但是目前我们的扩展太差,之后看了。
 *	2、你可以改变bd
 *
 *
 * @author liujie
 * @datetime 2019/11/7 15:29
 */
public class ImportBDRegistryBean implements ImportBeanDefinitionRegistrar,BeanClassLoaderAware {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		ImportDao importDao = (ImportDao) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{ImportDao.class},new CusInvocationHandler());
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(importDao.getClass());
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		registry.registerBeanDefinition("importDao",beanDefinition);
//		importDao.show("name");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("??");
	}
}
