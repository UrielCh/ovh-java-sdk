package net.minidev.ovh.api.domain.data.claimnotice;

import net.minidev.ovh.api.nichandle.OvhCountryEnum;

/**
 * Address for a claim notice holder
 */
public class OvhAddress {
	/**
	 * Phone number
	 *
	 * canBeNull && readOnly
	 */
	public String voice;

	/**
	 * State of province
	 *
	 * canBeNull && readOnly
	 */
	public String stateOrProvince;

	/**
	 * Array of street name
	 *
	 * canBeNull && readOnly
	 */
	public String[] streets;

	/**
	 * City
	 *
	 * canBeNull && readOnly
	 */
	public String city;

	/**
	 * Country code
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum countryCode;

	/**
	 * Postal zip code
	 *
	 * canBeNull && readOnly
	 */
	public String postalCode;

	/**
	 * Fax number extension
	 *
	 * canBeNull && readOnly
	 */
	public String faxExtension;

	/**
	 * Phone number extension
	 *
	 * canBeNull && readOnly
	 */
	public String voiceExtension;

	/**
	 * Fax number
	 *
	 * canBeNull && readOnly
	 */
	public String fax;
}
