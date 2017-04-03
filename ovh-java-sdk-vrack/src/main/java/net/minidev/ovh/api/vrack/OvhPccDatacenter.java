package net.minidev.ovh.api.vrack;

/**
 * vrack datacenter interface
 */
public class OvhPccDatacenter {
	/**
	 * Your dedicatedCloud name
	 *
	 * canBeNull && readOnly
	 */
	public String dedicatedCloud;

	/**
	 * vrack name
	 *
	 * canBeNull && readOnly
	 */
	public String vrack;

	/**
	 * Your dedicatedCloud datacenter name
	 *
	 * canBeNull && readOnly
	 */
	public String datacenter;
}
