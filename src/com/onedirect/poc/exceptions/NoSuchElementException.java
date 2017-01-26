package com.onedirect.poc.exceptions;

@SuppressWarnings("serial")
public class NoSuchElementException extends RuntimeException {
	public NoSuchElementException(String message){
		super(message);
	}
}
