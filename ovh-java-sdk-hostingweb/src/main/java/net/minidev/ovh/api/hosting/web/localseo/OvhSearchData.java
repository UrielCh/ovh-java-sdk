package net.minidev.ovh.api.hosting.web.localseo;

/**
 * Struct describing a location being checked for visibility
 */
public class OvhSearchData {
	/**
	 * Zipcode of the location
	 *
	 * canBeNull
	 */
	public String zip;

	/**
	 * Country of the location
	 *
	 * canBeNull
	 */
	public String country;

	/**
	 * Province of the location
	 *
	 * canBeNull
	 */
	public String province;

	/**
	 * City of the location
	 *
	 * canBeNull
	 */
	public String city;

	/**
	 * Street numero of the location
	 *
	 * canBeNull
	 */
	public String streetNo;

	/**
	 * Street of the location
	 *
	 * canBeNull
	 */
	public String street;

	/**
	 * Name of the location
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Id of the search
	 *
	 * canBeNull
	 */
	public Long id;

	/**
	 * Token to use to get the results of the search
	 *
	 * canBeNull
	 */
	public String token;
}
