package com.encore.mijung.repo;

import com.encore.mijung.domain.Customer;

public interface CustomerDAO {
	public boolean register(Customer customer) throws Exception;
	public Customer login(Customer customer) throws Exception;
	public boolean dropCustomer(String custId) throws Exception;
	public int idCheck(String custId) throws Exception;
	public Customer findId(Customer customer) throws Exception;
	public Customer findPassword(Customer customer) throws Exception;
	public boolean changePassword(Customer customer) throws Exception;
	public Customer getNameById(String custId) throws Exception;
	public int phoneCheck(String custPhone) throws Exception;
	public boolean changeCustRev0(String custId) throws Exception;
	public boolean changeCustRev1(String custId) throws Exception;
	public int getCustRev(String custId) throws Exception;
}
