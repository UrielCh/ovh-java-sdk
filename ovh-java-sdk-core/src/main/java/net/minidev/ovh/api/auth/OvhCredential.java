package net.minidev.ovh.api.auth;

/**
 * Credential request to get access to the API
 */
public class OvhCredential {
	/**
	 * canBeNull
	 */
	public String validationUrl;

	/**
	 * canBeNull
	 */
	public OvhCredentialStateEnum state;

	/**
	 * canBeNull
	 */
	public String consumerKey;
}
