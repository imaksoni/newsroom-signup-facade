package com.newsroom.signup.facade.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.newsroom.signup.facade.enums.ErrorCode;
import com.newsroom.signup.facade.exception.SignUpExceptions;
import com.newsroom.signup.facade.model.Data;
import com.newsroom.signup.facade.model.Request;
import com.newsroom.signup.facade.model.Response;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController()
public class SignupController {
	
	@Value("${singup.server.url}")
	private String serverUrl;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("signup")
	public Response<Data> fun(@RequestBody Request request) throws SignUpExceptions  {
		try {
			log.info(request.toString());
			Request req = Request.builder().firstName(request.getFirstName())
					.middleName(request.getMiddleName()).lastName(request.getLastName()).email(request.getEmail())
					.mob(request.getMob()).password(request.getPassword()).dob(request.getDob())
					.gender(request.getGender()).build();
			ResponseEntity<Response> responseEntity =restTemplate.exchange(serverUrl, HttpMethod.POST,new HttpEntity<Request>(req) ,Response.class );

			Response ret=responseEntity.getBody();
			
			log.info(ret.toString());
			return ret;
		} catch (Exception ex) {
			throw new SignUpExceptions(ErrorCode.NEWSROOM_ENGINE_DOWN);
		}

	}
}
