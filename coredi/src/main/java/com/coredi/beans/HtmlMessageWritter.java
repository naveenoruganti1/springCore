package com.coredi.beans;

import com.coredi.intrf.IMessageWritter;

public class HtmlMessageWritter implements IMessageWritter{

	@Override
	public String formateMessagewritter(String message) {
		String htmlMessage = "<html><body>"+message+"</body></html>";
		return htmlMessage;
	}
}
