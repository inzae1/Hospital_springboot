package com.encore.mijung.repo;

import java.util.List;

import com.encore.mijung.domain.Reservation;
import com.encore.mijung.domain.ReservationHistory;

public interface ReservationDAO {
	public void reservation(Reservation reservation) throws Exception;
	public List<Reservation> getReservation(String custId) throws Exception;
	public boolean cancelReservation(int revId) throws Exception;
	public List<Reservation> getAllReservation() throws Exception;
	
	public void addReservationHistory(ReservationHistory reservationHistory) throws Exception;
	public boolean deleteReservationHistory(int revHisId) throws Exception;
	public List<Reservation> findReservationHistoryById(String custId) throws Exception;
	public List<Reservation> findAllReservationHistory() throws Exception;
}
