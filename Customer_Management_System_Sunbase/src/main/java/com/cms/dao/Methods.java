package com.cms.dao;

import java.util.List;

import com.cms.model.Customer;

public interface Methods {

	 void addCustomer(Customer c) ;
	 void deleteCustomer(String id);
	 void updateCustomer(Customer c);
	 Customer getCustomer(String id);
	 List<Customer> getAllCustomer(int pageNumber, int pageSize);
	 String login(String username,String password);
	 List<Customer> searchCustomers(String searchTerm, String searchBy);
	
}
