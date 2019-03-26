package net.minidev.ovh.api.order.catalog._public;

/**
 * Describes a CPU for a Dedicated Server
 */
public class OvhDedicatedServerProductBlobTechnicalCPU {
	/**
	 * CPU score
	 *
	 * canBeNull && readOnly
	 */
	public Long score;

	/**
	 * Number of cores
	 *
	 * canBeNull && readOnly
	 */
	public Long cores;

	/**
	 * Number of threads
	 *
	 * canBeNull && readOnly
	 */
	public Long threads;

	/**
	 * CPU Boost
	 *
	 * canBeNull && readOnly
	 */
	public Long boost;

	/**
	 * Displayable name
	 *
	 * canBeNull && readOnly
	 */
	public String model;

	/**
	 * CPU Brand
	 *
	 * canBeNull && readOnly
	 */
	public String brand;

	/**
	 * Frequency of CPU in GHz
	 *
	 * canBeNull && readOnly
	 */
	public Double frequency;
}
