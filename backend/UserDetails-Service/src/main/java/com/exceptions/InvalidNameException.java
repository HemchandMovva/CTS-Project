package com.exceptions;

@SuppressWarnings("serial")
public class InvalidNameException extends Exception{

	public InvalidNameException(String str) {
		super(str);
	}
}
