package org.anacr.knowledge;

import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * 在了解Servlet之前,先知道这一特性吧:
 * servlet 3.0 之后在初始化Servlet容器之前调用在META-INF下声明了javax-servlet-ServletContainerInitializer文件中的类的onStartup()方法,
 * 如果在定义的类上加了:@HandlesTypes注解的话,那么就会把所有实现了注解定义的接口的实现的子类的Class对象放到Set集合中,这样我们可以自己注册我们的Servlet来实现动态插拔的
 * 效果。通过dynamic来进行注册关于这个Servlet的规则。真的是太厉害了。
 *
 *
 *
 *
 * @author liujie
 * @date 2019/12/14 21:55
 */
@HandlesTypes(CusServlet.class)
public class InitInvoke implements ServletContainerInitializer {
	/**
	 * ServletContext与Spring的上下文容器的概念类似
	 */
	@Override
	public void onStartup(Set<Class<?>> webAppInitializerClasses, ServletContext servletContext) throws ServletException {
		webAppInitializerClasses.stream().forEach(clazz-> {
			try {
				ServletRegistration.Dynamic dynamic = servletContext.addServlet(System.nanoTime() + "", (Servlet) clazz.newInstance());
				dynamic.setLoadOnStartup(1);
				dynamic.addMapping("/");
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		});
	}
}
