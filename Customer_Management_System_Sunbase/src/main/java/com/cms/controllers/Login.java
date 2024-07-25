package com.cms.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cms.daoImplements.MethodImplent;
import com.cms.model.Customer;
import com.cms.utility.SunbaseUtility;




@WebServlet("/login")
public class Login extends HttpServlet {
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		String token = SunbaseUtility.authenticate(un, pwd);
		
		if(token!=null) {
			HttpSession session = request.getSession(true);
			
			session.setAttribute("token", token);
			
			response.sendRedirect("customerList.jsp");

		}else {
			response.sendRedirect("index.jsp?error=Invalid username or password! Try Again!");
			
		}
		
	}

}
