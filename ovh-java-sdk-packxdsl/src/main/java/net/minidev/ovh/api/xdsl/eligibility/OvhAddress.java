package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Represents an address
 */
public class OvhAddress {
	/**
	 * Owner of the line, this information can be restricted
	 *
	 * canBeNull
	 */
	public String owner;

	/**
	 * Identifier of the door, if any
	 *
	 * canBeNull
	 */
	public String door;

	/**
	 * Identifier of the stair, if any
	 *
	 * canBeNull
	 */
	public String stair;

	/**
	 * Number on the street
	 *
	 * canBeNull
	 */
	public String streetNumber;

	/**
	 * Informations about the city
	 *
	 * canBeNull
	 */
	public OvhCity city;

	/**
	 * Informations about the street
	 *
	 * canBeNull
	 */
	public OvhStreet street;

	/**
	 * Identifier of the historical operator landmark, if any
	 *
	 * canBeNull
	 */
	public String logo;

	/**
	 * Identifier of the floor, if any
	 *
	 * canBeNull
	 */
	public String floor;

	/**
	 * Name of the residence, if any
	 *
	 * canBeNull
	 */
	public String residence;

	/**
	 * Name of the building, if any
	 *
	 * canBeNull
	 */
	public String building;
}
