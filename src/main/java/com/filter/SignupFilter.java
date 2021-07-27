package com.filter;

import java.io.IOException; 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SignupFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String accNumber = request.getParameter("accNumber");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String dob = request.getParameter("dob");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		boolean isError = false;

		if (accNumber == null || accNumber.trim().length() == 0) {
			isError = true;
			request.setAttribute("accNumberError", "<font color=red> Please Enter Account Number </font>");
		} else {
			request.setAttribute("accNumberValue", accNumber);
		}
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "<font color=red> Please Enter FirstName </font>");
		} else {
			request.setAttribute("firstNameValue", firstName);
		}
		if (lastName == null || lastName.trim().length() == 0) {
			isError = true;
			request.setAttribute("lastNameError", "<font color=red> Please Enter LastName </font>");
		} else {
			request.setAttribute("lastNameValue", lastName);
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "<font color=red> Please Enter Email </font>");
		} else {
			request.setAttribute("emailValue", email);
		}
		if (contact == null || contact.trim().length() == 0) {
			isError = true;
			request.setAttribute("contactError", "<font color=red> Please Enter Contact Number </font>");
		} else {
			request.setAttribute("contactValue", contact);
		}
		if (dob == null || dob.trim().length() == 0) {
			isError = true;
			request.setAttribute("dobError", "<font color=red> Please Enter Date Of Birth </font>");
		} else {
			request.setAttribute("dobValue", dob);
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "<font color=red> Please Enter Password </font>");
		} else {
			request.setAttribute("passwordValue", password);
		}
		if (confirmPassword == null || confirmPassword.trim().length() == 0) {
			isError = true;
			request.setAttribute("confirmPasswordError", "<font color=red> Please Enter Password Again</font>");
		} else if (password == confirmPassword) {
			isError = true;
			request.setAttribute("confirmPasswordError", "<font color=red> Please Enter SAME Password</font>");
		} else {
			request.setAttribute("confirmPasswordValue", confirmPassword);
		}
		if (isError == true) {
			System.out.println("error in validation");
			RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("validation done");
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
