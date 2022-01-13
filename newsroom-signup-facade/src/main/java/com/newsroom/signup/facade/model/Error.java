package com.newsroom.signup.facade.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.newsroom.signup.facade.enums.ErrorCode;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Error {
	@JsonProperty("errorCode")
	private ErrorCode errorCode;
	@JsonProperty("error")
	private String error;

}
