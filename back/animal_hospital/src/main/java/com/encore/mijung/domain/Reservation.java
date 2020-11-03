package com.encore.mijung.domain;

public class Reservation {
	int revId;
	String revDate;
	String revDoctor;
	String revComment;
	String revAnimalType;
	String custId;
	
	public Reservation() {}
	
	public Reservation(int revId, String revDate, String revDoctor, String revComment, String revAnimalType,
			String custId) {
		super();
		this.revId = revId;
		this.revDate = revDate;
		this.revDoctor = revDoctor;
		this.revComment = revComment;
		this.revAnimalType = revAnimalType;
		this.custId = custId;
	}
	
	public Reservation(String revDate, String revDoctor, String revComment, String revAnimalType,
			String custId) {
		this.revDate = revDate;
		this.revDoctor = revDoctor;
		this.revComment = revComment;
		this.revAnimalType = revAnimalType;
		this.custId = custId;
	}

	public int getRevId() {
		return revId;
	}

	public void setRevId(int revId) {
		this.revId = revId;
	}

	public String getRevDate() {
		return revDate;
	}

	public void setRevDate(String revDate) {
		this.revDate = revDate;
	}

	public String getRevDoctor() {
		return revDoctor;
	}

	public void setRevDoctor(String revDoctor) {
		this.revDoctor = revDoctor;
	}

	public String getRevComment() {
		return revComment;
	}

	public void setRevComment(String revComment) {
		this.revComment = revComment;
	}

	public String getRevAnimalType() {
		return revAnimalType;
	}

	public void setRevAnimalType(String revAnimalType) {
		this.revAnimalType = revAnimalType;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Reservation [revId=" + revId + ", revDate=" + revDate + ", revDoctor=" + revDoctor + ", revComment="
				+ revComment + ", revAnimalType=" + revAnimalType + ", custId=" + custId + "]";
	}
	
	
}
