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
	public boolean register(Customer customer) throws Exception {
		return customerDAO.register(customer);
		
	}

	@Override
	public Customer login(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.login(customer);
	}

	@Override
	public boolean dropCustomer(String custId) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.dropCustomer(custId);
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

	@Override
	public boolean changePassword(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.changePassword(customer);
	}

	@Override
	public Customer getNameById(String custId) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.getNameById(custId);
	}

	@Override
	public int phoneCheck(String custPhone) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.phoneCheck(custPhone);
	}


	@Override
	public int getCustRev(String custId) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.getCustRev(custId);
	}

	@Override
	public boolean changeCustRev0(String custId) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.changeCustRev0(custId);
	}

	@Override
	public boolean changeCustRev1(String custId) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.changeCustRev1(custId);
	}
	
	
}
