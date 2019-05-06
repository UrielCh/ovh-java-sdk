package net.minidev.ovh.api.telephony;

/**
 * Conference
 */
public class OvhConference {
	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

	/**
	 * canBeNull && readOnly
	 */
	public String[] offers;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
