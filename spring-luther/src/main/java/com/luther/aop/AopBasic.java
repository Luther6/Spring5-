package com.luther.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.aspectj.AspectInstanceFactory;
import org.springframework.aop.aspectj.AspectJAroundAdvice;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author liujie
 * @datetime 2019/11/24 21:58
 */
@Component
public class AopBasic implements AfterReturningAdvice {


	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

	}
}
