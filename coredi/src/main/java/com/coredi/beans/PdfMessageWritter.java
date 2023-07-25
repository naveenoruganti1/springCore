package com.coredi.beans;

import com.coredi.intrf.IMessageWritter;

public class PdfMessageWritter implements IMessageWritter{

	@Override
	public String formateMessagewritter(String message) {
		String pdfMessage = "<pdf>"+message+"</pdf>";
		return pdfMessage;
	}
}
