package com.newsroom.signup.facade.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.newsroom.signup.facade.exception.SignUpExceptions;
import com.newsroom.signup.facade.model.Error;

@ControllerAdvice
public class SignupControllerAdvice {

	@ExceptionHandler(SignUpExceptions.class)
	public ResponseEntity<Error> handleLoginException(SignUpExceptions exception)
	{
		
		Error error=Error.builder().errorCode(exception.getErrorCode()).error(exception.getErrMsg()).build();
		
		return new ResponseEntity<Error>(error, HttpStatus.ACCEPTED);
	}
}
