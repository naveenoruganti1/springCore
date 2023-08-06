package com.beanautowire.beans;

public class SalesOrder {
	public String soNum;
	public int quantity;
	public Distributor distributor;

	public void setSoNum(String soNum) {
		this.soNum = soNum;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}
	@Override
	public String toString() {
		return "SalesOrder [soNum=" + soNum + ", quantity=" + quantity + ", distributor=" + distributor + "]";
	}
}
