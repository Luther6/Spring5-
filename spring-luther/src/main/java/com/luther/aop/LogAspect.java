package com.luther.aop;

		import org.apache.commons.logging.Log;
		import org.apache.commons.logging.LogFactory;
		import org.aspectj.lang.ProceedingJoinPoint;
		import org.aspectj.lang.annotation.*;
		import org.springframework.context.annotation.Configuration;

		import java.util.Arrays;
		import java.util.List;

/**
 * @author liujie
 * @datetime 2019/11/19 21:46
 */
@Configuration
@Aspect
public class LogAspect {
	public final  static String EXECUTION =  "execution(public * com.luther.aop.*.*(..))";
	public final  static String WITHIN= "within(com.luther.aop.*)";
	public final static String THIS = "this(com.luther.aop.Aop)";/*"this(com.luther.aop.AopTestBean1)";*/

	/**
	 * Spring 4的日志默认采用的是JCL(默认采用的是log4j),而Spring 5采用的则是Spring-JCL(默认采用的是JUL)
	 * 之后分析
	 */
	public final Log log = LogFactory.getLog(LogAspect.class);

	@Pointcut(THIS)
	public void pointCut(){}

	@Before("pointCut()")
	public void before(){
		log.info("豫章故郡");
	}
	@After("pointCut()")
	public void afterA(){
		log.info("after");
	}

	public void show(){}

	@Around("pointCut()")
	public void AroundA(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("around");
		//直接调用调度器的proceed方法。为了调用@before方法 todo
		joinPoint.proceed();

	}
	@AfterReturning("pointCut()")
	public void AfterR() {
		log.info("afterReturning");

	}

	@AfterThrowing("pointCut()")
	public void AfterT(){
		log.info("afterThrowing");
	}
	/*
	@AfterReturning("execution(* com.luther.config.*.*(..))")
	public void afterRA(){

	}*/
}
