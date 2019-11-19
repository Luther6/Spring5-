package com.luther.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author liujie
 * @datetime 2019/11/18 13:47
 */
public class CusProperty {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream("D:\\Source\\spring-framework-5.1.x\\spring-luther\\src\\main\\resources\\application.properties");
		properties.load(inputStream);
		System.out.println(properties.getProperty("jdbc.username"));
	}
}
