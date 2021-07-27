package com.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class SignupFilterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String accNumber = request.getParameter("accNumber");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String dob = request.getParameter("dob");
		String password = request.getParameter("password");
		boolean isError = false;

		if (accNumber == null || accNumber.trim().length() == 0) {
			isError = true;
			request.setAttribute("accNumberError", accNumber);
		} else {
			request.setAttribute("accNumberValue", accNumber);
		}
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", firstName);
		} else {
			request.setAttribute("firstNameValue", firstName);
		}
		if (lastName == null || lastName.trim().length() == 0) {
			isError = true;
			request.setAttribute("lastNameError", lastName);
		} else {
			request.setAttribute("lastNameValue", lastName);
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", email);
		} else {
			request.setAttribute("emailValue", email);
		}
		if (contact == null || contact.trim().length() == 0) {
			isError = true;
			request.setAttribute("contactError", contact);
		} else {
			request.setAttribute("contactValue", contact);
		}
		if (dob == null || dob.trim().length() == 0) {
			isError = true;
			request.setAttribute("dobError", dob);
		} else {
			request.setAttribute("dobValue", dob);
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", password);
		} else {
			request.setAttribute("passwordValue", password);
		}

		UserBean bean = new UserBean();
		UserDao dao = new UserDao();
		

		bean.setAccNumber(Integer.parseInt(accNumber));
		bean.setFirstName(firstName);
		System.out.println("firstname -> " +firstName);
		bean.setLastName(lastName);
		bean.setEmail(email);
		bean.setContact(Integer.parseInt(contact));
		bean.setDob(dob);
		bean.setPassword(password);
		
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		System.out.println("6 digit number -> " + number);
		
		bean.setUserId(number);

		int records = dao.signupUser(bean);
		
		RequestDispatcher rd = null;
		if (isError || records == 0) {
			rd = request.getRequestDispatcher("Signup.jsp");
		} else {

			

//			this will convert any number sequence into 6 character.
//			return String.format("%06d", number);

			rd = request.getRequestDispatcher("ListAllUserInfoController");

		}
		rd.forward(request, response);
	}

}
