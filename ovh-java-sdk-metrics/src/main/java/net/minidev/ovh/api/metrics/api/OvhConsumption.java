package net.minidev.ovh.api.metrics.api;

/**
 * Structure holding the consumption
 */
public class OvhConsumption {
	/**
	 * Current monthly active data streams
	 *
	 * canBeNull && readOnly
	 */
	public Long mads;

	/**
	 * Current Daily data points
	 *
	 * canBeNull && readOnly
	 */
	public Long ddp;
}
