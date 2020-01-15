package org.anacr.knowledge;

import org.anacr.config.MvcConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Spring会调用到这个方法
 *
 *
 *
 * @author liujie
 * @date 2019/12/14 23:31
 */
public class InitWebMvcInvoke implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		/*AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(MvcConfig.class);
		webApplicationContext.refresh();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
		dispatcher.addMapping("/");
		dispatcher.setLoadOnStartup(1);*/
	}
}
