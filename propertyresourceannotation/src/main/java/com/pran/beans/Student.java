package com.pran.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {
	private int studentId;
	@Value("${studentName}")
	private String studentName;
	@Value("${branch}")
	private String branch;
	@Value("${colleageName}")
	private String colleageName;

	public Student(@Value("${studentId}") int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", branch=" + branch
				+ ", colleageName=" + colleageName + "]";
	}
}
