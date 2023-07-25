package com.coredi.beans;

import com.coredi.intrf.IMessageFormatter;

public class MessageWritter {
	IMessageFormatter messageFormatter;
	
	public void writeMessage(String message) {
		String cMessage = null;
		
		cMessage = messageFormatter.formateMessagewritter(message);
		System.out.println(cMessage);
	}
	public void setMessageWritter(IMessageFormatter formatter) {
		this.messageFormatter = formatter; 
	}
}
