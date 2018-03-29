package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Telephony service
 */
public class OvhTelephonyService {
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
	 * Does this service have fax capabilities?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hasFaxCapabilities;

	/**
	 * canBeNull && readOnly
	 */
	public Long simultaneousLines;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Current outplan
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice currentOutplan;

	/**
	 * The service offers
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineOffer getPublicOffer;

	/**
	 * The country code of the number
	 *
	 * canBeNull && readOnly
	 */
	public Number countryCode;

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
	public OvhPropertyEnum[] properties;
}
