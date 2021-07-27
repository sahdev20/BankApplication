package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.User;
import com.bean.UserBean;
import com.dao.UserDao;

public class ListAllUserInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		UserBean bean = new UserBean();
		UserDao dao = new UserDao();
		
		ArrayList<UserBean>	list = dao.getDataById(Integer.parseInt(bean.userId));
		request.setAttribute("listuser", list);
		request.getRequestDispatcher("ListAllInfo.jsp").forward(request, response);
	}

}
