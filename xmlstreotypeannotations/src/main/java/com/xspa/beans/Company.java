package com.xspa.beans;

//No Source code
public class Company {
	private String companyName;
	private String location;

	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", location=" + location + "]";
	}
}
