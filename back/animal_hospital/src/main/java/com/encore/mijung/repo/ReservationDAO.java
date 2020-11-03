package com.encore.mijung.repo;

import java.util.List;

import com.encore.mijung.domain.Reservation;

public interface ReservationDAO {
	public void reservation(Reservation reservation) throws Exception;
	public Reservation getReservation(String custId) throws Exception;
	public boolean cancelReservation(String custId) throws Exception;
	public List<Reservation> getAllReservation() throws Exception;
}
