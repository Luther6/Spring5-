package com.luther.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @datetime 2019/11/19 22:43
 */
@Component
public class AopTestBean implements Aop{

	/**
	 * show()与 take()方法都是需要被AOP作用的方法。但是如果我们在目标对象中调用另一个切面作用的方法,
	 * 如何做到拦截效果呢?因为JDK动态代理是基于接口来实现的。然后通过反射来调用目标对象的方法。
	 * 所以我们无法再做拦截。那么有什么办法可以做到呢?必须要使用代理对象来进行访问才会被拦截。看一下?
	 *
	 * 使用AopContext.currentProxy获取到当前目标对象的代理对象。但是必须要把@EnableAs[ectJAutoProxy的exposeProxy设为 true。
	 * 默认为false。否则会报错
	 */
	@Override
	public void show(){
		System.out.println("洪都新府");
//		take("可以被拦截嘛");
//		((Aop)AopContext.currentProxy()).take("使用代理对象可以被拦截了");
	}

	@Override
	public void take(String name){
		System.out.println(name);
	}


	public void show(String name,Integer age){
		System.out.println("name "+" age");
	}

	@Override
	public int hashCode() {
		System.out.println("Hello");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("ok1");
		return super.equals(obj);
	}
}
