package cn.com.github;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// handler get method style
		System.out.println("Get requirement");
		// set charset
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// output information
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");// 注意转义字符
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>Hello,这是一个 由Servlet 动态生成的网页！</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// handler get method style
		System.out.println("Post requirement");
	}

}
