package net.minidev.ovh.api.dedicatedcloud;

/**
 * Hypervisor and their availability
 */
public class OvhHostStockHypervisor {
	/**
	 * Version of hypervisor
	 *
	 * canBeNull
	 */
	public String version;

	/**
	 * Number of available hypervisors
	 *
	 * canBeNull
	 */
	public Long value;
}
