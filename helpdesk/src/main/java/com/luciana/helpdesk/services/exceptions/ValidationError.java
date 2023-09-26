package com.luciana.helpdesk.services.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.luciana.helpdesk.resources.exceptions.StandardError;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError() {
		super();
	}

	public ValidationError(Long timestamp, Integer status, String error, String message, String path) {
		super(timestamp, status, error, message, path);
	}

	public List<FieldMessage> getErros() {
		return errors;
	}

	public void addError(String fildName, String message) {
		this.errors.add(new FieldMessage(fildName, message));
	}
	
	
}
