package com.ucdi.beans;

import java.util.List;

public class Contract {
	public int contractNo;
	public String contractName;
	public List<String> works;

	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public void setWorks(List<String> works) {
		this.works = works;
	}
	@Override
	public String toString() {
		return "Contract [contractNo=" + contractNo + ", contractName=" + contractName + ", works=" + works
				+ ", className=" + works.getClass().getCanonicalName() + "]";
	}
}
