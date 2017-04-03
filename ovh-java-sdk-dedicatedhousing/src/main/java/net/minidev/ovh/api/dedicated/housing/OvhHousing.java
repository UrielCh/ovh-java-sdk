package net.minidev.ovh.api.dedicated.housing;

/**
 * Housing bay
 */
public class OvhHousing {
	/**
	 * The bay's description
	 *
	 * canBeNull && readOnly
	 */
	public String rack;

	/**
	 * Housing bay options
	 *
	 * canBeNull && readOnly
	 */
	public OvhOptions options;

	/**
	 * The name you give to the bay
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Bay Security code
	 *
	 * canBeNull && readOnly
	 */
	public String securityCode;

	/**
	 * Housing bay datacenter
	 *
	 * canBeNull && readOnly
	 */
	public OvhDatacenterEnum datacenter;

	/**
	 * Housing bay network
	 *
	 * canBeNull && readOnly
	 */
	public OvhNetworkInfo[] network;
}
