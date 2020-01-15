package com.luther.FactoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *在说这个问题之前先来了解一下啊关于BeanFactory与FactoryBean的区别:
 * 1、BeanFactory是Spring中bean 工厂,而FactoryBean只是Spring中的一个bean而已
 *
 * 那么如何理解FactoryBean呢?工厂Bean就很好,
 * 1、它是Spring中的一个bean
 * 2、但是她和普通的Bean有所区别，它是工厂,可以生成一个Bean的	工厂Bean。
 *
 * 具体使用,当我们把这个类注册到Spring容器中,如果我们通过这个Bean的名称获取对象的话,
 * 那么我们只会获取到getObject()返回的对象。这个返回的Bean何时初始化取决于实现了方法
 *
 * isSingleton()。默认为true,就是单例的bean。
 *
 * 如何获取到FactoryBean这个对象呢?只需要在获取Bean的BeanName前面加上&。
 * 当然这只是通过名称获取时,我们需要注意的规则?我们通过类型获取的时候,只要通过类型获取
 * 并不需要其余的操作。
 *
 * 那么你会想这个类有什么作用呢? 它返回的类就是一个Bean而已?为什么我们不能直接在返回的这个类上
 * 加上我们的@Component呢。
 *
 * 这个类的主要作用在MyBaits源码中体现的淋漓尽致。主要总结一下。之后分析MyBaits源码再来。
 * 这个主要可以进行对一个复杂的Bean进行一些处理。比如你在实例化之前要进行一些必要的配置。这些配置
 * 如果放在构造方法中可能不太优美。
 * 还有这个类可以根据情况返回不同的Bean,你可以在对象的基础上加上一些代理等信息。之后看吧。
 * @author liujie
 * @datetime 2019/11/13 21:57
 */
@Component
public class FactoryTestBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {

		return new TestBean();
	}

	@Override
	public Class<?> getObjectType() {
		return TestBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
