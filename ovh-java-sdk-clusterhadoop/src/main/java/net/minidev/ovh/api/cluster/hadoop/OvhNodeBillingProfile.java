package net.minidev.ovh.api.cluster.hadoop;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Detailed information on a node billing profile
 */
public class OvhNodeBillingProfile {
	/**
	 * Name of the Node billing profile
	 *
	 * canBeNull
	 */
	public String nodeProfile;

	/**
	 * Total number of the CPU cores
	 *
	 * canBeNull
	 */
	public Long nbCPUCores;

	/**
	 * Total amount of RAM
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> ramQuantity;

	/**
	 * Frequency of one CPU core
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> CPUFrequency;

	/**
	 * Total number of the CPU threads
	 *
	 * canBeNull
	 */
	public Long nbCPUThreads;

	/**
	 * Network speed of the link used for the Hadoop process
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> networkBandwidth;

	/**
	 * Total capacity available for HDFS
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> diskCapacity;
}
