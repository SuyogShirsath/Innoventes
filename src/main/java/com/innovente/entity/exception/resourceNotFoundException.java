package com.innovente.entity.exception;


public class resourceNotFoundException extends RuntimeException {
	
	String resourceName;
	String fieldname;
	long fieldValue;
	public resourceNotFoundException(String resourceName, String fieldname, long fieldValue) {
		super(String.format("%s not found with %s:%s" ,resourceName , fieldname ,fieldValue));
		this.resourceName = resourceName;
		this.fieldname = fieldname;
		this.fieldValue = fieldValue;
	}


	
	
	
	
	
}
