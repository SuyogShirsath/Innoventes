package com.innovente.entity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppResponce {
	
	private String message;
	
	private boolean success;
	
	private HttpStatus httpStatus;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public AppResponce(String message, boolean success, HttpStatus httpStatus) {
		this.message = message;
		this.success = success;
		this.httpStatus = httpStatus;
	}

	@Override
	public String toString() {
		return "AppResponce [message=" + message + ", success=" + success + ", httpStatus=" + httpStatus + "]";
	}
	
	

}
