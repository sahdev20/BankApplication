package com.controller;

import java.io.IOException;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.UserBean;
import com.dao.UserDao;

public class LogInFilterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		boolean isError = false;

		UserDao dao = new UserDao();
		UserBean bean = dao.authenticate(Integer.parseInt(userId), password);

		if (userId == null || userId.trim().length() == 0 || bean.getUserId() == Integer.parseInt(userId)) {
			isError = true;
			request.setAttribute("userIdError", userId);
		} else {
			request.setAttribute("userIdValue", userId);
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", password);
		} else {
			request.setAttribute("passwordValue", password);
		}

		RequestDispatcher rd = null;

		if (isError || bean == null) {
			request.setAttribute("error", "Invalid Credentials");
			rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		} else {

			String url = "Homepage.jsp";
			url = response.encodeUrl(url);
			response.sendRedirect(url);
			// response.sendRedirect("Homepage.jsp");
		}
	}
}
