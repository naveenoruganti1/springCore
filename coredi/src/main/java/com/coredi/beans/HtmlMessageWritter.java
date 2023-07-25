package com.coredi.beans;

import com.coredi.intrf.IMessageFormatter;

public class HtmlMessageWritter implements IMessageFormatter{

	@Override
	public String formateMessagewritter(String message) {
		String htmlMessage = "<html><body>"+message+"</body></html>";
		return htmlMessage;
	}
}
