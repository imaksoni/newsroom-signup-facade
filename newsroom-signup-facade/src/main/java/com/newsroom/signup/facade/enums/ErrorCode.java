package com.newsroom.signup.facade.enums;

public enum ErrorCode {

	NEWSROOM_ENGINE_DOWN("10000"), NEWSROOM_ENGINE_FAILURE("10001"),REQUEST_PARM_NOT_FOUND("10002"),HEADER_NOT_FOUND("10003"),
	PASSWORD_WRONG("10004"),EMAIL_WRONG("10005"),MOB_WRONG("10006"),WRONG_OTP("10007");

	ErrorCode(String i) {
	}
}
