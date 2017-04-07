package net.minidev.ovh.api.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
public class OvhToken {
	/**
	 * canBeNull && readOnly
	 */
	@JsonProperty("X-Auth-Token")
	public String X_Auth_Token;

	/**
	 * canBeNull && readOnly
	 */
	public OvhOpenstackToken token;
}
