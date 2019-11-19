package com.luther.methodinject;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 在Spring中会遇到这么一个问题,如果我们的单例的Bean中如果需要依赖一个Prototype Bean的话,那么我们如果按照原来的方法注入,那么并无法得到,
 * 因为Singleton Bean在Spring 中只会初始化一次,那么他的依赖也是会被初始化一次,所以无法完成上面的任务,所以Spring中为我们提供了这么一个解决办法
 * 1、继承ApplicationContextAware方法并重写这么一个方法,然后在每次使用的时候getBean()
 * 2、使用lookup注解或者XML配置
 *
 *
 * @author liujie
 * @datetime 2019/11/2 23:52
 */
@Component
@Scope("singleton")
public class SingleBean implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	public void usePrototypeBean(){
		PrototypeBean prototypeBean = (PrototypeBean) applicationContext.getBean("prototypeBean");

	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
//		System.out.println(applicationContext.getClass().getSimpleName());

	}
}
