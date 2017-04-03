package net.minidev.ovh.api.contact;

import net.minidev.ovh.api.nichandle.OvhCountryEnum;

/**
 * Representation of an Address
 */
public class OvhAddress {
	/**
	 * Zipcode
	 *
	 * canBeNull && readOnly
	 */
	public String zip;

	/**
	 * Country
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum country;

	/**
	 * Province name
	 *
	 * canBeNull && readOnly
	 */
	public String province;

	/**
	 * City
	 *
	 * canBeNull && readOnly
	 */
	public String city;

	/**
	 * Others details
	 *
	 * canBeNull && readOnly
	 */
	public String otherDetails;

	/**
	 * Third line of the address
	 *
	 * canBeNull && readOnly
	 */
	public String line3;

	/**
	 * Second line of the address
	 *
	 * canBeNull && readOnly
	 */
	public String line2;

	/**
	 * First line of the address
	 *
	 * canBeNull && readOnly
	 */
	public String line1;
}
