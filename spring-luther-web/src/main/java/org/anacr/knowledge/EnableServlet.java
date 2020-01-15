package org.anacr.knowledge;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author liujie
 * @date 2019/12/14 22:21
 */
public class EnableServlet extends HttpServlet implements CusServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String basePath = EnableServlet.class.getResource("/").getPath();
		String requestURI = request.getRequestURI();
		String path = basePath + requestURI;

		FileInputStream fileInputStream = new FileInputStream(new File(path));
		byte []bytes = new byte[2022];
		while (fileInputStream.read(bytes)!=-1);
		fileInputStream.close();
		response.getOutputStream().write(bytes);
	}

	@Override
	public void init() throws ServletException {
		System.out.println("when----------------");
	}

	public static void main(String[] args) {
		System.out.println(EnableServlet.class.getResource("/").getPath());
	}
}
