package com.encore.mijung.repo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.mijung.domain.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	private String ns = "CustomerMapper.";
	
	@Autowired
	private SqlSession sqlSesstion;
	
	@Override
	public void register(Customer customer) throws Exception {
		sqlSesstion.insert(ns+"register", customer);
		
	}

	@Override
	public Customer login(Customer customer) throws Exception {
		return sqlSesstion.selectOne(ns+"login", customer);
	}

	@Override
	public void dropCustomer(String custId) throws Exception {
		sqlSesstion.delete(ns+"dropCustomer", custId);
	}

	@Override
	public int idCheck(String custId) throws Exception {
		
		return sqlSesstion.selectOne(ns+"idCheck", custId);
	}

	@Override
	public Customer findId(Customer customer) throws Exception {

		return sqlSesstion.selectOne(ns+"findId", customer);
	}

	@Override
	public Customer findPassword(Customer customer) throws Exception {

		return sqlSesstion.selectOne(ns+"findPassword", customer);
	}

}
