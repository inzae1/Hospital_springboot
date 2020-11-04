package com.encore.mijung.controller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encore.mijung.domain.Customer;
import com.encore.mijung.domain.Reservation;
import com.encore.mijung.service.CustomerService;
import com.encore.mijung.service.ReservationService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("mijung")
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/reservation")
	public ResponseEntity reservation(@RequestBody Reservation reservation) throws Exception{
		reservationService.reservation(reservation);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/getReservation/{custId}")
	public ResponseEntity getReservation(@PathVariable String custId) throws Exception{
		Reservation getReservation = reservationService.getReservation(custId);
		if(getReservation==null)return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(getReservation,HttpStatus.OK);
	}
	
	@DeleteMapping("/cancelReservation/{custId}")
	public ResponseEntity cancelReservation(@PathVariable String custId) throws Exception{
		System.out.println("cancel");
		boolean result = reservationService.cancelReservation(custId);
		if(!result) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("getAllReservation")
	public ResponseEntity<List<Reservation>> getAllReservation() throws Exception{
		List<Reservation> revs = reservationService.getAllReservation();
		if(revs.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(revs,HttpStatus.OK);
	}
}
