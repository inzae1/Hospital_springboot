package com.encore.mijung.domain;

public class Customer {
	String custId;
	String custPassword;
	String custName;
	String custPhone;
	int custAdmin;
	int custCanRev;
	
	public Customer() {}
	
	public Customer(String custId, String custPassword, String custName, String custPhone) {
		this.custId = custId;
		this.custPassword = custPassword;
		this.custName = custName;
		this.custPhone = custPhone;
	}

	public Customer(String custId, String custPassword, String custName, String custPhone, int custAdmin, int custCanRev) {
		this.custId = custId;
		this.custPassword = custPassword;
		this.custName = custName;
		this.custPhone = custPhone;
		this.custAdmin = custAdmin;
		this.custCanRev = custCanRev;
	}
	
	public int getCustCanRev() {
		return custCanRev;
	}

	public void setCustCanRev(int custCanRev) {
		this.custCanRev = custCanRev;
	}

	public Customer(String custName, String custPhone) {
		this.custName = custName;
		this.custPhone = custPhone;
	}
	
	public Customer(String CustId) {
		this.custId = CustId;
	}
	
	public Customer(String custId, String custName, String custPhone) {
		this.custId = custId;
		this.custName = custName;
		this.custPhone = custPhone;
	}
	

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public int getCustAdmin() {
		return custAdmin;
	}

	public void setCustAdmin(int custAdmin) {
		this.custAdmin = custAdmin;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId  + ", custName=" + custName
				+ "]";
	}
	
	
}
