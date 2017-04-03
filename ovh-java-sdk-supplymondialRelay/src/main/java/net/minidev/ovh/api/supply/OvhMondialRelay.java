package net.minidev.ovh.api.supply;

import net.minidev.ovh.api.coretypes.OvhCountryEnum;

/**
 * Mondial Relay Point Details
 */
public class OvhMondialRelay {
	/**
	 * Relay country
	 *
	 * canBeNull
	 */
	public OvhCountryEnum country;

	/**
	 * Relay point address
	 *
	 * canBeNull
	 */
	public String address;

	/**
	 * Distance between address and relay point
	 *
	 * canBeNull
	 */
	public Double distance;

	/**
	 * Relay point longitude
	 *
	 * canBeNull
	 */
	public Double lng;

	/**
	 * City
	 *
	 * canBeNull
	 */
	public String city;

	/**
	 * Relay point picture\s URL
	 *
	 * canBeNull
	 */
	public String pictureUrl;

	/**
	 * Relay point opening hours
	 *
	 * canBeNull
	 */
	public OvhMondialRelayOpening opening;

	/**
	 * Zipcode
	 *
	 * canBeNull
	 */
	public String zipcode;

	/**
	 * Relay point closing dates
	 *
	 * canBeNull
	 */
	public OvhMondialRelayClosingPeriod[] closing;

	/**
	 * Relay point name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * URL of short map
	 *
	 * canBeNull
	 */
	public String mapUrl;

	/**
	 * Mondial Relay point ID
	 *
	 * canBeNull
	 */
	public String id;

	/**
	 * Relay point latitude
	 *
	 * canBeNull
	 */
	public Double lat;
}
