package org.anacr.app;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;
import java.io.IOException;

/**
 * @author liujie
 * @date 2019/12/14 21:13
 */
public class SpringApplication {

	public static void main(String[] args) throws IOException {
		//D:\Source\spring-framework-5.1.x\src\main\webapp idea 得到的是父目录下的位置


	}
	/**
	 * 无XML配置来启动SpringXML
	 */
	public static void run() {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8089);

		String sourcePath = SpringApplication.class.getResource("/").getPath();

		//设置Tomcat的webApp目录,我们也可以不使用Webapp的目录来像SpringBoot一样来实现同样的效果
		//contextPath:为项目的访问路径 docBase：为tomcat 的项目路径，调用这个方法的话,那么Tomcat就为认为当前的项目为Web项目
		Context context = tomcat.addWebapp("/", "D:\\Source\\spring-framework-5.1.x\\spring-luther-web\\src\\main\\webapp");

		//提供Class
		WebResourceRoot resources = new StandardRoot(context);

		resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes", sourcePath, "/"));

		context.setResources(resources);

		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
