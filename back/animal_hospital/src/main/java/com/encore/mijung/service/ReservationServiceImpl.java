package com.encore.mijung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.mijung.domain.Reservation;
import com.encore.mijung.repo.ReservationDAO;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private ReservationDAO reservationDAO;

	@Override
	public void reservation(Reservation reservation) throws Exception {
		// TODO Auto-generated method stub
		reservationDAO.reservation(reservation);
	}

	@Override
	public List<Reservation> getReservation(String custId) throws Exception {
		// TODO Auto-generated method stub
		return reservationDAO.getReservation(custId);
	}

	@Override
	public boolean cancelReservation(String custId) throws Exception {
		// TODO Auto-generated method stub
		return reservationDAO.cancelReservation(custId);
	}

	@Override
	public List<Reservation> getAllReservation() throws Exception {
		// TODO Auto-generated method stub
		return reservationDAO.getAllReservation();
	}
	
	
}
