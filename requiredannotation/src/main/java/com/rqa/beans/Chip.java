package com.rqa.beans;

import org.springframework.beans.factory.annotation.Required;

public class Chip {
	private int chipNo;
	private String chipName;

	@Required
	public void setChipNo(int chipNo) {
		this.chipNo = chipNo;
	}
	public void setChipName(String chipName) {
		this.chipName = chipName;
	}
	@Override
	public String toString() {
		return "Chip [chipNo=" + chipNo + ", chipName=" + chipName + "]";
	}
	
}
