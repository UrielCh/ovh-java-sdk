package net.minidev.ovh.api.dedicatedcloud;

/**
 * PCC and their availability
 */
public class OvhPccStockProfile {
	/**
	 * Kind of hypervisor
	 *
	 * canBeNull
	 */
	public String mode;

	/**
	 * Hypervisor version
	 *
	 * canBeNull
	 */
	public String realVersion;

	/**
	 * Available PCC
	 *
	 * canBeNull
	 */
	public Long count;
}
