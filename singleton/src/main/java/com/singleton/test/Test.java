package com.singleton.test;

import com.singleton.beans.AssingJobShedulaer;
import com.singleton.beans.JobShecduler;

public class Test {

	public static void main(String[] args) {
		JobShecduler jobShecduler = new JobShecduler();
		jobShecduler.execute();
		
		AssingJobShedulaer assingJobShedulaer = new AssingJobShedulaer();
		assingJobShedulaer.assign();
	}

}
