package cn.com.github;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InitServlet implements Servlet {

	int i;
	
	@Override
	public void destroy() {

		System.out.println("销毁");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig servletconfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("初始化");
	}

	@Override
	public void service(ServletRequest servletrequest, ServletResponse servletresponse)
			throws ServletException, IOException {
		System.out.println("服务...");
		System.out.println("i:" + i + " " + Thread.currentThread().getName());
		i++;
	}

	public InitServlet() {

		System.out.println("构造了 InitServlet对象");
	}

}
