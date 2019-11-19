package com.luther.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 *   	 这里会出现这样的一个情况,我们要保证单例的话,这样你会发现根本没有办法保证单例,在初始化methodBean1时,调用了methodBean
 *     这样你或发现MethodBean并不是单例的,这样就出现了问题。如何解决呢?加上我们的@Configuration,你会发现此时只会实例化一次了?
 *     那么Spring时怎么做到的呢? 分析源码
 */



@Configuration
@Component
public class MoreMethodBean {

	@Bean("meh")
	public MethodBean methodBeanA(){
		return new MethodBean();
	}

	@Bean("meh1")
	public MethodBean1 methodBeanB(){
		methodBeanA();
		return new MethodBean1();
	}
}
