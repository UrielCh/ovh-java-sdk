package net.minidev.ovh.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class OvhErrorMessage {
	public static String INVALID_CREDENTIAL = "INVALID_CREDENTIAL";
	public static String NOT_CREDENTIAL = "NOT_CREDENTIAL";
	public static String QUERY_TIME_OUT = "QUERY_TIME_OUT";
	public static String NOT_GRANTED_CALL = "NOT_GRANTED_CALL";

	/**
	 * Ovh error code
	 */
	public String errorCode;
	/**
	 * http code + status line
	 */
	public String httpCode;
	/*
	 * error message
	 */
	public String message;

	/**
	 * this function will be deprecated and replace by an Enum;
	 */
	@JsonIgnore
	public boolean isErrorCode(String... codes) {
		for (String err : codes)
			if (errorCode.equals(err))
				return true;
		return false;
	}
}
