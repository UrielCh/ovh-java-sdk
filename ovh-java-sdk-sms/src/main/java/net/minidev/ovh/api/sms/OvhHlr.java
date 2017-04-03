package net.minidev.ovh.api.sms;

/**
 * Sms operator informations
 */
public class OvhHlr {
	/**
	 * The country
	 *
	 * canBeNull && readOnly
	 */
	public String country;

	/**
	 * The countryCode prefix number
	 *
	 * canBeNull && readOnly
	 */
	public String countryCode;

	/**
	 * The region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * The operator name
	 *
	 * canBeNull && readOnly
	 */
	public String operator;

	/**
	 * The network name
	 *
	 * canBeNull && readOnly
	 */
	public String network;
}
