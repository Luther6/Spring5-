package com.luther.aop;

import org.springframework.context.annotation.*;

/**
 * @author liujie
 * @datetime 2019/11/19 21:43
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true) //开启Spring AOP代理。其主要的作用就是为我们的Spring上下文中注入一个后置处理器。分析一下把。
						//proxyTargetClass 用来开启默认使用什么代理 默认为false:JDK,true:CGLib
@ComponentScan("com.luther.aop")
public class AopConfig {
/*	@Bean
	public AopTestBean aopTestBean(){
		System.out.println("config ------------1");
		return new AopTestBean();
	}
	@Bean
	public AopTestBean aopTestBean2(){
		aopTestBean();
		System.out.println("config ------------2");
		return new AopTestBean();
	}*/
}
