package com.encore.mijung.repo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.mijung.domain.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	private String ns = "CustomerMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public boolean register(Customer customer) throws Exception {
		int result = sqlSession.insert(ns+"register", customer);
		if(result>0) return true;
		return false;
	}

	@Override
	public Customer login(Customer customer) throws Exception {
		return sqlSession.selectOne(ns+"login", customer);
	}

	@Override
	public boolean dropCustomer(String custId) throws Exception {
		int result =sqlSession.delete(ns+"dropCustomer", custId);
		if(result>0) return true;
		return false;
	}

	@Override
	public int idCheck(String custId) throws Exception {
		
		return sqlSession.selectOne(ns+"idCheck", custId);
	}

	@Override
	public Customer findId(Customer customer) throws Exception {

		return sqlSession.selectOne(ns+"findId", customer);
	}

	@Override
	public Customer findPassword(Customer customer) throws Exception {

		return sqlSession.selectOne(ns+"findPassword", customer);
	}

	@Override
	public boolean changePassword(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		int result =sqlSession.update(ns+"changePassword", customer);
		if(result>0) return true;
		return false;
	}

	@Override
	public Customer getNameById(String custId) throws Exception {
		return sqlSession.selectOne(ns + "getNameById", custId);
	}

	@Override
	public int phoneCheck(String custPhone) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns + "phoneCheck", custPhone);
	}

	@Override
	public int getCustRev(String custId) throws Exception {
		return sqlSession.selectOne(ns + "getCustRev", custId);
	}

	@Override
	public boolean changeCustRev0(String custId) throws Exception {
		int result =sqlSession.update(ns + "changeCustRev0", custId);
		if(result>0) return true;
		return false;
	}

	@Override
	public boolean changeCustRev1(String custId) throws Exception {
		int result =sqlSession.update(ns + "changeCustRev1", custId);
		if(result>0) return true;
		return false;
	}

}
