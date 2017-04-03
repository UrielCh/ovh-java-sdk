package net.minidev.ovh.api.vrack;

/**
 * vrack dedicated cloud interface
 */
public class OvhDedicatedCloud {
	/**
	 * Dedicated cloud vlanId used
	 *
	 * canBeNull && readOnly
	 */
	public Long vlanId;

	/**
	 * your dedicated cloud service
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
}
