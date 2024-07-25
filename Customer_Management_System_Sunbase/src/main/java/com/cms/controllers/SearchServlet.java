package com.cms.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.daoImplements.MethodImplent;
import com.cms.model.Customer;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String searchWord = request.getParameter("search-input");
        String searchBy = request.getParameter("search-by");
        
        // Perform validation on search input if necessary
        //or call call directly by newServiceImpl().searchCustomers()
        MethodImplent service = new MethodImplent();
        List<Customer> searchResults = service.searchCustomers(searchWord, searchBy);
        //adding customer details to searchResults and attaching it it request object
        request.setAttribute("searchResults", searchResults);
        
        // giving control to the customerList.jsp
        request.getRequestDispatcher("/customerList.jsp").forward(request, response);
    }
}

