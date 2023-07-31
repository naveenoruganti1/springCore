package com.collectiondi.beans;

import java.util.Set;

public class Store {
	public int storeNo;
	public String storeName;
	public Set<Staff> staff;
	
	public Store(int storeNo) {
		this.storeNo = storeNo;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Store [storeNo=" + storeNo + ", storeName=" + storeName + ", staff=" + staff + "]";
	}
}
