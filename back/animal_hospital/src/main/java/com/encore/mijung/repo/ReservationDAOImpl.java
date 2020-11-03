package com.encore.mijung.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.mijung.domain.Reservation;

@Repository
public class ReservationDAOImpl implements ReservationDAO{
	
	private String ns= "ReservationMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void reservation(Reservation reservation) throws Exception {
		sqlSession.insert(ns+"reservation",reservation);
		
	}

	@Override
	public Reservation getReservation(String custId) throws Exception {
		
		return sqlSession.selectOne(ns+"getReservation", custId);
	}

	@Override
	public boolean cancelReservation(String custId) throws Exception {
		return sqlSession.delete(ns+"cancelReservation",custId)==1;
		
	}

	@Override
	public List<Reservation> getAllReservation() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getAllReservation");
	}
	
	
}
