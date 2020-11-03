package com.encore.mijung.service;

import com.encore.mijung.domain.Customer;

public interface CustomerService {
	public void register(Customer customer) throws Exception;
	public Customer login(Customer customer) throws Exception;
	public void dropCustomer(String custId) throws Exception;
	public int idCheck(String custId) throws Exception;
	public Customer findId(Customer customer) throws Exception;
	public Customer findPassword(Customer customer) throws Exception;
}
