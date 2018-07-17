package net.minidev.ovh.api.iploadbalancing.zone;

/**
 * IP Load Balancing Zone
 */
public class OvhZone {
	/**
	 * Name of your zone
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * State of your zone
	 *
	 * canBeNull && readOnly
	 */
	public String state;
}
