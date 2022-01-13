package com.newsroom.signup.facade.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Request {

	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("middleName")
	private String middleName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("email")
	private String email;
	@JsonProperty("mob")
	private String mob;
	@JsonProperty("password")
	private String password;
	@JsonProperty("conformPassword")
	private String conformPassword;
	@JsonProperty("dob")
	private String dob;
	@JsonProperty("gender")
	private String gender;

}
