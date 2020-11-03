package com.encore.mijung.service;

import java.util.List;

import com.encore.mijung.domain.Reservation;

public interface ReservationService {
	public void reservation(Reservation reservation) throws Exception;
	public Reservation getReservation(String custId) throws Exception;
	public boolean cancelReservation(String custId) throws Exception;
	public List<Reservation> getAllReservation() throws Exception;
}
