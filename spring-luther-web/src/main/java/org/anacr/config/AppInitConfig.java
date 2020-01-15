package org.anacr.config;

import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;



public class AppInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer  {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[0];
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[0];
	}

	@Override
	protected String[] getServletMappings() {
		return new String[0];
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		System.out.println("-----------------------");
		registration.setMultipartConfig(new MultipartConfigElement("C:\\Users\\Administrator\\Desktop"));
	}
}
