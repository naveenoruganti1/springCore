package com.collectiondi.beans;

import java.util.Map;

public class ElectionCommission {
	public Map<String, Person> electionList;

	public void setElectionList(Map<String, Person> electionList) {
		this.electionList = electionList;
	}

	@Override
	public String toString() {
		return "ElectionCommission [electionList=" + electionList + "]";
	}	
}
