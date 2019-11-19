package com.luther.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;
import java.util.Arrays;

/**
 * 这个类实现了 BeanPostProcessor 接口。那么如何返回一个寡对象呢?就是实现我们下面的方法#postProcessBeforeInstantiation。
 * 测试类为{@link WidowBean}。
 * 如果在这里这样拦截的话。那么需要被注入的属性就不会被注入。输出为空。这就是所谓的寡对象
 *
 * 你也可以通过方法#postProcessAfterInstantiation,让Spring先帮你把对象实例化好。然后再通过这个方法来阻止(返回False)
 * Spring为你填充属性。这样比起上面就不那么寡一些
 *
 *
 *
 *
 *
 * @author liujie
 * @datetime 2019/11/14 13:00
 */
@Component
public class InstantiationAwareBP implements InstantiationAwareBeanPostProcessor {


	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) {
	 	if("widowBean".equals(beanName)){
			try {
				return beanClass.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if(beanName.equals("quoteA")){
			Arrays.stream(pvs.getPropertyValues()).forEach(System.out::println);
			return pvs;
		}
		return null;
	}
}
