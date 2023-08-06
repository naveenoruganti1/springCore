package com.beanautowire.beans;

public class Distributor {
	public String udNo;
	public String distributorName;

	public void setUdNo(String udNo) {
		this.udNo = udNo;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	@Override
	public String toString() {
		return "Distributor [udNo=" + udNo + ", distributorName=" + distributorName + "]";
	}	
}
