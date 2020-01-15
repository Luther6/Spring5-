package org.anacr.config;

import org.anacr.interceptor.CusInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @author liujie
 * @datetime 2019/12/2 22:50
 */
@Configuration
@EnableWebMvc
//@ComponentScan("org.anacr")
public class MvcConfig implements WebMvcConfigurer {
	/**
	 * 用来注册视图控制器 equal:
	 * <mvc:view-controller path="/" view-name="home"/>
	 * @param registry
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
	}

	/**
	 * 用来注册默认的视图解析器
	 * 如果需要配置特定的模板引擎解析器,参考：@see https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html
	 * @param registry
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		/**
		 * 注册使用JackSon和Jsp来做视图的默认解析
		 */
//		registry.enableContentNegotiation(new MappingJackson2JsonView());
		registry.jsp();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CusInterceptor()).addPathPatterns("/**");
	}

	/**
	 * 当然也可以使用下面的下面的方法来进行注入,两种方法都会被添加到 {@link ViewResolverRegistry#viewResolvers} 中
	 * @return
	 */
	/*@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setSuffix(".jsp");
		internalResourceViewResolver.setPrefix("/");
		return internalResourceViewResolver;
	}*/
	@Bean("multipartResolver")
	public CommonsMultipartResolver commonsMultipartResolver(){
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
		return commonsMultipartResolver;
	}
/*	@Bean("multipartResolver")
	public StandardServletMultipartResolver standardServletMultipartResolver(){
		StandardServletMultipartResolver standardServletMultipartResolver = new StandardServletMultipartResolver();
		return standardServletMultipartResolver;
	}*/

}
