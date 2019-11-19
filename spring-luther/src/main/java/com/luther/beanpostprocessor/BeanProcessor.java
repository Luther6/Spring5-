package com.luther.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * 在spring中是如何实现我们的AOP,IOC等功能的呢?这里主要涉及到了的后置处理器这一概念,
 * 在Spring中实现BeanPostProcessor那么我们就可以在Bean生成前或者生成后对Bean进行一定的操作
 * 在Spring中我们BeanPostProcessor有很多那么我们如何来控制调用的顺序呢?需要实现PriorityOrdered接口来赋予值,值越小越优先调用
 *
 *
 *
 *
 *
 * @author liujie
 * @datetime 2019/11/3 0:38
 */
@Component
public class BeanProcessor  implements BeanPostProcessor,PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean.getClass().getSimpleName().equals(PostProcessorBean.class.getSimpleName())){
			System.out.println("茅屋为秋风所破歌");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean.getClass().getSimpleName().equals("UserDao")){
			System.out.println("高者挂罥长林梢");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 10;
	}
}
