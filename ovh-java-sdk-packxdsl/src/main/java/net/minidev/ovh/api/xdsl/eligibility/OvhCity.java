package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Represent a city
 */
public class OvhCity {
	/**
	 * Zip code of the city
	 *
	 * canBeNull
	 */
	public String zipCode;

	/**
	 * INSEE code of the city
	 *
	 * canBeNull
	 */
	public String inseeCode;

	/**
	 * Locality (subset of a city)
	 *
	 * canBeNull
	 */
	public String locality;

	/**
	 * Name of the city
	 *
	 * canBeNull
	 */
	public String name;
}
