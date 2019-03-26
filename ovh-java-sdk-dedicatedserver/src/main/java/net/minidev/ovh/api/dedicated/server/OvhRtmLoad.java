package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * A structure describing informations about server load
 */
public class OvhRtmLoad {
	/**
	 * Load average in the last 15 minutes
	 *
	 * canBeNull
	 */
	public Double loadavg15;

	/**
	 * Load average in the last 1 minute
	 *
	 * canBeNull
	 */
	public Double loadavg1;

	/**
	 * Memory usage
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> memory;

	/**
	 * Number of processes using or waiting for CPU time
	 *
	 * canBeNull
	 */
	public Long processCount;

	/**
	 * Swap usage
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> swap;

	/**
	 * CPU usage
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> cpu;

	/**
	 * Load average in the last 5 minutes
	 *
	 * canBeNull
	 */
	public Double loadavg5;

	/**
	 * Server uptime
	 *
	 * canBeNull
	 */
	public Long uptime;

	/**
	 * Number of process running
	 *
	 * canBeNull
	 */
	public Long processRunning;
}
