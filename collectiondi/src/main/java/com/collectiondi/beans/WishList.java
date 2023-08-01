package com.collectiondi.beans;

import java.util.Properties;

public class WishList {
	public String personName;
	public int age;
	public String location;
	public Properties wishList;

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setWishList(Properties wishList) {
		this.wishList = wishList;
	}
	@Override
	public String toString() {
		return "WishList [personName=" + personName + ", age=" + age + ", location=" + location + ", wishList="
				+ wishList + "]";
	}
}
