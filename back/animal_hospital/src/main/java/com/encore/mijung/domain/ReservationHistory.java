package com.encore.mijung.domain;

public class ReservationHistory {
	int revHisId;
	String revHisDate;
	String revHisDoctor;
	String revHisComment;
	String revHisAnimalType;
	String custId;
	
	
	public ReservationHistory() {	}
	
	public ReservationHistory(int revHisId, String revHisDate, String revHisDoctor, String revHisComment,
			String revHisAnimalType, String custId) {
		this.revHisId = revHisId;
		this.revHisDate = revHisDate;
		this.revHisDoctor = revHisDoctor;
		this.revHisComment = revHisComment;
		this.revHisAnimalType = revHisAnimalType;
		this.custId = custId;
	}
	
	public ReservationHistory(String revHisDate, String revHisDoctor, String revHisComment, String revHisAnimalType,
			String custId) {
		super();
		this.revHisDate = revHisDate;
		this.revHisDoctor = revHisDoctor;
		this.revHisComment = revHisComment;
		this.revHisAnimalType = revHisAnimalType;
		this.custId = custId;
	}

	public int getRevHisId() {
		return revHisId;
	}
	public void setRevHisId(int revHisId) {
		this.revHisId = revHisId;
	}
	public String getRevHisDate() {
		return revHisDate;
	}
	public void setRevHisDate(String revHisDate) {
		this.revHisDate = revHisDate;
	}
	public String getRevHisDoctor() {
		return revHisDoctor;
	}
	public void setRevHisDoctor(String revHisDoctor) {
		this.revHisDoctor = revHisDoctor;
	}
	public String getRevHisComment() {
		return revHisComment;
	}
	public void setRevHisComment(String revHisComment) {
		this.revHisComment = revHisComment;
	}
	public String getRevHisAnimalType() {
		return revHisAnimalType;
	}
	public void setRevHisAnimalType(String revHisAnimalType) {
		this.revHisAnimalType = revHisAnimalType;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		return "ReservationHistory [revHisId=" + revHisId + ", revHisDate=" + revHisDate + ", revHisDoctor="
				+ revHisDoctor + ", revHisComment=" + revHisComment + ", revHisAnimalType=" + revHisAnimalType
				+ ", custId=" + custId + "]";
	}
	
	
}
