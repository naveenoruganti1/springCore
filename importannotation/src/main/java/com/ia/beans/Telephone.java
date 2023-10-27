package com.ia.beans;

//no source code
public class Telephone {
	private String telephoneNumber;
	private String subscriptionType;

	public Telephone(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	@Override
	public String toString() {
		return "Telephone [telephoneNumber=" + telephoneNumber + ", subscriptionType=" + subscriptionType + "]";
	}
}
