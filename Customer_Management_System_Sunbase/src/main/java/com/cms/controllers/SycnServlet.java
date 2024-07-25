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


@WebServlet("/Sycn")
// the purpose of this servlet is getting details of customers into table
public class SycnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String token =(String)session.getAttribute("token");
		System.out.println(token);
		List<Customer> customerList = SunbaseUtility.fetchCustomerList(token);
		
		for(Customer customer:customerList) {
			new MethodImplent().addCustomer(customer);
			System.out.println(customer);
		}
		
		response.sendRedirect("customerList.jsp");
	}

}
