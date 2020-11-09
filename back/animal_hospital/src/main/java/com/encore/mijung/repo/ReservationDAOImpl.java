package com.encore.mijung.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.mijung.domain.Reservation;
import com.encore.mijung.domain.ReservationHistory;

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
	public List<Reservation> getReservation(String custId) throws Exception {
		
		return sqlSession.selectList(ns+"getReservation", custId);
	}

	@Override
	public boolean cancelReservation(int revId) throws Exception {
		return sqlSession.delete(ns+"cancelReservation",revId)==1;
		
	}

	@Override
	public List<Reservation> getAllReservation() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getAllReservation");
	}

	@Override
	public void addReservationHistory(ReservationHistory reservationHistory) throws Exception {
		sqlSession.insert(ns + "addReservationHistory", reservationHistory);
	}

	@Override
	public boolean deleteReservationHistory(int revHisId) throws Exception {
		return sqlSession.delete(ns + "deleteReservationHistory", revHisId) ==1;
	}

	@Override
	public List<Reservation> findReservationHistoryById(String custId) throws Exception {
		return sqlSession.selectList(ns + "findReservationHistoryById", custId);
	}

	@Override
	public List<Reservation> findAllReservationHistory() throws Exception {
		return sqlSession.selectList(ns + "findAllReservationHistory");
	}
	
	
}
