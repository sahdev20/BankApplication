package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CreateForgotUserIdFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String accNumber = request.getParameter("accNumber");
		String dob = request.getParameter("dob");
		boolean isError = false;
		if(accNumber == null || accNumber.trim().length() == 0) {
			isError = true;
			request.setAttribute("accNumberError", "<font color=red> Please Enter Account Number </font>");
		} else {
			request.setAttribute("accNumberValue", accNumber);
		}
		if (dob == null || dob.trim().length() == 0) {
			isError = true;
			request.setAttribute("dobError", "<font color=red> Please Enter Date Of Birth </font>");
		} else {
			request.setAttribute("dobVlaue", dob);
		}
		if (isError) {
			//back to create userId page
			RequestDispatcher rd = request.getRequestDispatcher("CreateUserId.jsp");
			rd.forward(request, response);
		} else {
//			RequestDispatcher rd = request.getRequestDispatcher("CreateForgotUserIdController");
//			rd.forward(request, response);
			
			chain.doFilter(request, response);
		}
	}

	public void destroy() {

	}

}
