package com.collectiondi.beans;

public class Staff {
	public int staffNo;
	public String staffName;
	public int age;
	public String gender;

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Staff [staffNo=" + staffNo + ", staffName=" + staffName + ", age=" + age + ", gender=" + gender + "]";
	}
}
