package com.fb.beans;

import java.util.Arrays;
import java.util.Calendar;

public class Meeting {
	private String meetingName;
	private String[] attendies;
	private Calendar meetingTime;

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}
	public void setAttendies(String[] attendies) {
		this.attendies = attendies;
	}
	public void setMeetingTime(Calendar meetingTime) {
		this.meetingTime = meetingTime;
	}
	@Override
	public String toString() {
		return "Meeting [meetingName=" + meetingName + ", attendies=" + Arrays.toString(attendies) + ", meetingTime="
				+ meetingTime + "]";
	}
}
