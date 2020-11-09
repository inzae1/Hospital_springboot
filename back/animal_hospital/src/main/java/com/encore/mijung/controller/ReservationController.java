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
import com.encore.mijung.domain.ReservationHistory;
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
		List<Reservation> getReservation = reservationService.getReservation(custId);
		if(getReservation==null)return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(getReservation,HttpStatus.OK);
	}
	
	@DeleteMapping("/cancelReservation/{revId}")
	public ResponseEntity cancelReservation(@PathVariable int revId) throws Exception{
		System.out.println("cancel");
		boolean result = reservationService.cancelReservation(revId);
		if(!result) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/getAllReservation")
	public ResponseEntity<List<Reservation>> getAllReservation() throws Exception{
		List<Reservation> revs = reservationService.getAllReservation();
		if(revs.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(revs,HttpStatus.OK);
	}
	
	@PostMapping("/addReservationHistory")
	public ResponseEntity addReservationHistory(@RequestBody ReservationHistory reservationHistory) throws Exception{
		reservationService.addReservationHistory(reservationHistory);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteReservationHistory/{revHisId}")
	public ResponseEntity deleteReservationHistory(@PathVariable int revHisId) throws Exception{
		System.out.println("cancel");
		boolean result = reservationService.deleteReservationHistory(revHisId);
		if(!result) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/findAllReservationHistory")
	public ResponseEntity<List<Reservation>> findAllReservationHistory() throws Exception{
		List<Reservation> revs = reservationService.findAllReservationHistory();
		if(revs.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(revs,HttpStatus.OK);
	}
	
	@GetMapping("/findReservationHistoryById/{custId}")
	public ResponseEntity findReservationHistoryById(@PathVariable String custId) throws Exception{
		List<Reservation> getReservation = reservationService.findReservationHistoryById(custId);
		if(getReservation==null)return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(getReservation,HttpStatus.OK);
	}
	
}
