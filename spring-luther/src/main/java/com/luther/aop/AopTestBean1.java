package com.luther.aop;

import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @datetime 2019/11/21 23:14
 */
@Component
public class AopTestBean1 implements Aop{
	public void show(){
		System.out.println("星分翼轸");
	}

	@Override
	public void take(String name) {

	}
}
