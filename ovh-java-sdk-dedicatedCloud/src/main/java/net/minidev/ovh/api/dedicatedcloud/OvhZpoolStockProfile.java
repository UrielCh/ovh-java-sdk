package net.minidev.ovh.api.dedicatedcloud;

/**
 * Zpool and their availability
 */
public class OvhZpoolStockProfile {
	/**
	 * Reference of zpool
	 *
	 * canBeNull
	 */
	public String profile;

	/**
	 * Minimum accepted available zpools
	 *
	 * canBeNull
	 */
	public String minimumAvailability;

	/**
	 * Available zpools
	 *
	 * canBeNull
	 */
	public Long realCount;
}
