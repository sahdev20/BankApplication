package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogInFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		boolean isError = false;

		if (userId == null || userId.trim().length() == 0) {
			isError = true;
			request.setAttribute("userIdError", "<font color=red> Please Enter UserID </font>");
		} else {
			request.setAttribute("userIdValue", userId);
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "<font color=red> Please Enter Password </font>");
		} else {
			request.setAttribute("passwordValue", password);
		}
		if (isError == true) {
			System.out.println("error in validation");
			RequestDispatcher rd = request.getRequestDispatcher("LogIn.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("validation done");
			chain.doFilter(request, response);
		}
	}

	public void destroy() {

	}
}
