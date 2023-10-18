package com.devsuperior.dslearnbds.services.exceptions;

// Error customizado 403
public class ForbiddenException extends RuntimeException {

	public ForbiddenException(String msg) {
		super(msg);
	}
}
