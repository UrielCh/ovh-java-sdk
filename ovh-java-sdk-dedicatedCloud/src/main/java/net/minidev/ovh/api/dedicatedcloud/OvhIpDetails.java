package net.minidev.ovh.api.dedicatedcloud;

/**
 * Details about an Ip
 */
public class OvhIpDetails {
	/**
	 * IP address usage details
	 *
	 * canBeNull
	 */
	public String usageDetails;

	/**
	 * IP address usage
	 *
	 * canBeNull
	 */
	public OvhIpUsageEnum usage;

	/**
	 * IP address
	 *
	 * canBeNull
	 */
	public String ip;

	/**
	 * IP address reverse record
	 *
	 * canBeNull
	 */
	public String reverse;
}
