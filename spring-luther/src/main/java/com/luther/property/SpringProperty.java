package com.luther.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @datetime 2019/11/18 13:50
 */
@Component
@PropertySource(value = {"classpath:application.properties","classpath:source/application.properties","classpath:source/spring.properties"})
public class SpringProperty {
	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	@Value("${jdbc.driverClassName}")
	private String driverClassName;

	@Override
	public String toString() {
		return "SpringProperty{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", driverClassName='" + driverClassName + '\'' +
				'}';
	}
}
