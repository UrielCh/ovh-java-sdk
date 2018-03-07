package net.minidev.ovh.api.iploadbalancing;

/**
 * Available additional zone to order for a Load Balancer
 */
public class OvhOrderableZone {
	/**
	 * The zone three letter code
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * The billing planCode for this zone
	 *
	 * canBeNull
	 */
	public String planCode;
}
