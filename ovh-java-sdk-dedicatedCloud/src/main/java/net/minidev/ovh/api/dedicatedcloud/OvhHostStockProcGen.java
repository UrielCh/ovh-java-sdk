package net.minidev.ovh.api.dedicatedcloud;

/**
 * Processor generation and their availability
 */
public class OvhHostStockProcGen {
	/**
	 * CPU generation
	 *
	 * canBeNull
	 */
	public String cpuGeneration;

	/**
	 * Number of available hosts
	 *
	 * canBeNull
	 */
	public OvhHostStockHypervisor[] value;
}
