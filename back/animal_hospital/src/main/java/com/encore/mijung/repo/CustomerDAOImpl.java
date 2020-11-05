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
	public boolean register(Customer customer) throws Exception {
		int result = sqlSesstion.insert(ns+"register", customer);
		if(result>0) return true;
		return false;
	}

	@Override
	public Customer login(Customer customer) throws Exception {
		return sqlSesstion.selectOne(ns+"login", customer);
	}

	@Override
	public boolean dropCustomer(String custId) throws Exception {
		int result =sqlSesstion.delete(ns+"dropCustomer", custId);
		if(result>0) return true;
		return false;
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

	@Override
	public boolean changePassword(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		int result =sqlSesstion.update(ns+"changePassword", customer);
		if(result>0) return true;
		return false;
	}

	@Override
	public Customer getNameById(String custId) throws Exception {
		return sqlSesstion.selectOne(ns + "getNameById", custId);
	}

}
