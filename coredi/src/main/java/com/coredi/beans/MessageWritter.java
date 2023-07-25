package com.coredi.beans;

import com.coredi.intrf.IMessageWritter;

public class MessageWritter {
	IMessageWritter messageWritter;
	
	public void writeMessage(String message) {
		String cMessage = null;
		
		cMessage = messageWritter.formateMessagewritter(message);
		System.out.println(cMessage);
	}
	public void setMessageWritter(IMessageWritter iMessageWritter) {
		this.messageWritter = iMessageWritter; 
	}
}
