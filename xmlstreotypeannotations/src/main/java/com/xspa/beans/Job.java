package com.xspa.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Source Code
@Component
public class Job {
	@Value("#{applicationProperties.jobNo}")
	private int jobNo;
	@Value("#{applicationProperties.jobTitle}")
	private String jobTitle;
	
	@Autowired
	private Company company;
	
	@Override
	public String toString() {
		return "Job [jobNo=" + jobNo + ", jobTitle=" + jobTitle + ", company=" + company + "]";
	}
}
