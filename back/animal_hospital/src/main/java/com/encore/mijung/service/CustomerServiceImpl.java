package com.encore.mijung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.mijung.domain.Customer;
import com.encore.mijung.repo.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public void register(Customer customer) throws Exception {
		customerDAO.register(customer);
		
	}

	@Override
	public Customer login(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.login(customer);
	}

	@Override
	public void dropCustomer(String custId) throws Exception {
		// TODO Auto-generated method stub
		customerDAO.dropCustomer(custId);
	}

	@Override
	public int idCheck(String custId) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.idCheck(custId);
	}

	@Override
	public Customer findId(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.findId(customer);
	}

	@Override
	public Customer findPassword(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.findPassword(customer);
	}
	
	
}
