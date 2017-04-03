package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Telephony service
 */
public class OvhTelephonyService {
	/**
	 * Current outplan
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice currentOutplan;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeServiceEnum serviceType;

	/**
	 * canBeNull && readOnly
	 */
	public String[] offers;

	/**
	 * The country of the number
	 *
	 * canBeNull && readOnly
	 */
	public OvhNumberCountryEnum country;

	/**
	 * canBeNull && readOnly
	 */
	public Long simultaneousLines;

	/**
	 * The country code of the number
	 *
	 * canBeNull && readOnly
	 */
	public OvhNumberCountryCodeEnum countryCode;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum featureType;

	/**
	 * The identifier to use to port the number
	 *
	 * canBeNull && readOnly
	 */
	public String rio;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPropertyEnum[] properties;
}
