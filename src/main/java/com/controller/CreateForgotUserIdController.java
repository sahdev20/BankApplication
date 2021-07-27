package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class CreateForgotUserIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {

		System.out.println("init from Filter.......signup filter .....");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String accNumber = request.getParameter("accNumber");
		String dob = request.getParameter("dob");
		
		UserDao dao = new UserDao();
		UserBean bean = new UserBean();
		
		if(dao.users.equals(accNumber)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
			dispatcher.forward(request, response);
			
		}
	}
	
	public void service() {
		
	}

}
