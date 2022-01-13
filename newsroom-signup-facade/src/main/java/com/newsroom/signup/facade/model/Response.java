package com.newsroom.signup.facade.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Response<T>{
	
	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("data")
	private T data;

}
