package com.collectiondi.beans;

public class Person {
	public String uid;
	public String fullName;
	public String gender;
	public String age;

	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [uid=" + uid + ", fullName=" + fullName + ", gender=" + gender + ", age=" + age + "]";
	}
}
