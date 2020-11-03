package com.encore.mijung.domain;

public class Customer {
	String custId;
	String custPassword;
	String custName;
	int custAdmin;
	
	public Customer() {}
	
	public Customer(String custId, String custPassword, String custName) {
		this.custId = custId;
		this.custPassword = custPassword;
		this.custName = custName;
	}

	public Customer(String custId, String custPassword, String custName, int custAdmin) {
		this.custId = custId;
		this.custPassword = custPassword;
		this.custName = custName;
		this.custAdmin = custAdmin;
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
