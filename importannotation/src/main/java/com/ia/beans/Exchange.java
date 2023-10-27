package com.ia.beans;

//no source code
public class Exchange {
	private int exchangeNo;
	private String area;
	private Telephone telephone;
	
	public Exchange(int exchangeNo) {
		this.exchangeNo = exchangeNo;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Exchange [exchangeNo=" + exchangeNo + ", area=" + area + ", telephone=" + telephone + "]";
	}
}
