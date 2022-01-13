package com.newsroom.signup.facade.exception;

import com.newsroom.signup.facade.enums.ErrorCode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SignUpExceptions extends Exception {
	
	private static final long serialVersionUID = 1L;
	private ErrorCode errorCode;
	private String errMsg;
	
	 public SignUpExceptions(ErrorCode errorCode) {
		this.errorCode=errorCode;
		this.errMsg="Something went wrong, Pls try again later";
	}

}
