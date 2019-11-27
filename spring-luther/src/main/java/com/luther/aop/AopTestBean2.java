package com.luther.aop;

import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @datetime 2019/11/22 20:00
 */
@Component
public class AopTestBean2 implements Aop {
	@Override
	public void show() {
		System.out.println("襟三江而带五湖");
	}

	@Override
	public void take(String name) {

	}
}
