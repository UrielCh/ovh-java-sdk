package net.minidev.ovh.api.order.catalog.pcc;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Describes a Private Cloud Host CPU
 */
public class OvhHostCpuSpecifications {
	/**
	 * CPU Generation
	 *
	 * canBeNull && readOnly
	 */
	public String generation;

	/**
	 * Number of CPU Cores
	 *
	 * canBeNull && readOnly
	 */
	public Long cores;

	/**
	 * Number of CPU Threads
	 *
	 * canBeNull && readOnly
	 */
	public Long threads;

	/**
	 * CPU Model
	 *
	 * canBeNull && readOnly
	 */
	public String model;

	/**
	 * Number of CPU
	 *
	 * canBeNull && readOnly
	 */
	public Long socket;

	/**
	 * CPU Frequency
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> frequency;
}
