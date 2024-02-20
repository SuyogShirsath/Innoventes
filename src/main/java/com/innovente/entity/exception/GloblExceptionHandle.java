package com.innovente.entity.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.innovente.entity.config.AppResponce;

@RestControllerAdvice
public class GloblExceptionHandle {
	
	
	@ExceptionHandler(resourceNotFoundException.class)
	public ResponseEntity<AppResponce> handleResourceNotFoundException(resourceNotFoundException re){
		
		AppResponce appResponce=new AppResponce("Resource Not Found", true, HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<AppResponce>(appResponce , HttpStatus.NOT_FOUND);
	}
}
