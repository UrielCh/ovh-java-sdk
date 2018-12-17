package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * Describe U2F SignRequest
 */
public class OvhU2FSignRequest {
	/**
	 * canBeNull
	 */
	public String challenge;

	/**
	 * canBeNull
	 */
	public String keyHandle;

	/**
	 * canBeNull
	 */
	public String version;
}
