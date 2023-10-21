package com.rqa.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private Chip chip;

	@Required
	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}
	
	
}
