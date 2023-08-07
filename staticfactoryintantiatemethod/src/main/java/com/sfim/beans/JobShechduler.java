package com.sfim.beans;

import java.util.Calendar;

public class JobShechduler {
	public String jobSchedulerName;
	public Calendar calendar;
	public int priority;
	
	public void setJobSchedulerName(String jobSchedulerName) {
		this.jobSchedulerName = jobSchedulerName;
	}
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "JobShechduler [jobSchedulerName=" + jobSchedulerName + ", calendar=" + calendar.getTime() + ", priority="
				+ priority + "]";
	}
}
