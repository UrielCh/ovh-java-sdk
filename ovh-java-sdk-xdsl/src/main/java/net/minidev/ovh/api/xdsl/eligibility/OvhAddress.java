package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Represents an address
 */
public class OvhAddress {
	/**
	 * The identifier of the door, if any
	 *
	 * canBeNull
	 */
	public String door;

	/**
	 * The identifier of the stair, if any
	 *
	 * canBeNull
	 */
	public String stair;

	/**
	 * The information about the city
	 *
	 * canBeNull
	 */
	public OvhCity city;

	/**
	 * The number in the street
	 *
	 * canBeNull
	 */
	public String streetNumber;

	/**
	 * The information about the street
	 *
	 * canBeNull
	 */
	public OvhStreet street;

	/**
	 * The identifier of the floor, if any
	 *
	 * canBeNull
	 */
	public String floor;

	/**
	 * The name of the residence, if any
	 *
	 * canBeNull
	 */
	public String residence;

	/**
	 * The name of the building, if any
	 *
	 * canBeNull
	 */
	public String building;
}
