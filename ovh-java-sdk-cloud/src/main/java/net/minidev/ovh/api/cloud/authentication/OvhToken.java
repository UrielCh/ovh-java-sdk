package net.minidev.ovh.api.cloud.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Token
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
