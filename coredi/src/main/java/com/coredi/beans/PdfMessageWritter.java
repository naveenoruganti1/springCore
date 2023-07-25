package com.coredi.beans;

import com.coredi.intrf.IMessageFormatter;

public class PdfMessageWritter implements IMessageFormatter{

	@Override
	public String formateMessagewritter(String message) {
		String pdfMessage = "<pdf>"+message+"</pdf>";
		return pdfMessage;
	}
}
