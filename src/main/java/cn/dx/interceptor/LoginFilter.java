package cn.dx.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.dx.model.User;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain fc) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession(); // 获取session

		String str = req.getRequestURI();

		String[] temp = str.split("\\?");

		String uri = temp[0];

		if (uri.endsWith("/login") || uri.endsWith("loginValidator")
				|| uri.endsWith(".png") || uri.endsWith(".gif")
				|| uri.endsWith(".jpg") || uri.endsWith("feedback")
				|| uri.endsWith("index") || uri.endsWith(".eot")
				|| uri.endsWith(".woff") || uri.endsWith(".ttf")
				|| uri.endsWith(".svg") || uri.contains("media")
				|| uri.contains("css") || uri.endsWith("js")
				|| uri.endsWith("registVerfyCode")
				|| uri.contains("countorder")) {

			fc.doFilter(request, response);
		} else {
			User user = (User) session.getAttribute("UuserModel");

			if (session.getAttribute("UuserModel") != null) {

				fc.doFilter(request, response);
			} else {
				res.sendRedirect("index");

				return;
			}
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
