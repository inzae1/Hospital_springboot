package com.encore.mijung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encore.mijung.domain.Customer;
import com.encore.mijung.service.CustomerService;

@RestController
@RequestMapping("mijung")
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public ResponseEntity register(Customer customer) throws Exception{
		customerService.register(customer);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody Customer customer) throws Exception{
		Customer loginCustomer = customerService.login(customer);
		String msg = "";
		if(customer.getCustId()!=loginCustomer.getCustId()) {
			msg = "가입되지 않은 아이디입니다.";
			return new ResponseEntity(msg, HttpStatus.NO_CONTENT);
		}else if(customer.getCustPassword()!=loginCustomer.getCustPassword()) {
			msg ="비밀번호가 일치하지 않습니다.";
			return new ResponseEntity(msg, HttpStatus.NO_CONTENT);
		}else return new ResponseEntity(loginCustomer, HttpStatus.OK);
	}
	
	
	
}
