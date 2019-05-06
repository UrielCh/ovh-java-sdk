package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Address
 */
public class OvhAddress {
	/**
	 * Identifier of the door, if any
	 *
	 * canBeNull
	 */
	public String door;

	/**
	 * ZIP code
	 *
	 * canBeNull
	 */
	public String zipCode;

	/**
	 * Street name, hidden for unlisted number
	 *
	 * canBeNull
	 */
	public String streetName;

	/**
	 * INSEE code
	 *
	 * canBeNull
	 */
	public String inseeCode;

	/**
	 * Owner name, this information can be restricted
	 *
	 * canBeNull
	 */
	public String ownerName;

	/**
	 * City name
	 *
	 * canBeNull
	 */
	public String city;

	/**
	 * Street number, usually a number and an indication if applicable (B for bis, T for ter, etc...) and hidden for unlisted number
	 *
	 * canBeNull
	 */
	public String streetNumber;

	/**
	 * Name of the housing complex, if any
	 *
	 * canBeNull
	 */
	public String housingComplex;

	/**
	 * Street code, an unique identifier of the street, hidden for unlisted number
	 *
	 * canBeNull
	 */
	public String streetCode;

	/**
	 * Identifier of the stair, if any
	 *
	 * canBeNull
	 */
	public String stairs;

	/**
	 * Identifier of the floor, if any
	 *
	 * canBeNull
	 */
	public String floor;

	/**
	 * Name of the building, if any
	 *
	 * canBeNull
	 */
	public String building;
}
