package com.devsuperior.dslearnbds.services.exceptions;

// Error customizado 401
public class UnauthorizedException extends RuntimeException {

	public UnauthorizedException(String msg) {
		super(msg);
	}
}
