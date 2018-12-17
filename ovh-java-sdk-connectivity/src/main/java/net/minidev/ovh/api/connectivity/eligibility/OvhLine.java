package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Copper line details
 */
public class OvhLine {
	/**
	 * Line address
	 *
	 * canBeNull
	 */
	public OvhAddress address;

	/**
	 * Copper informations
	 *
	 * canBeNull
	 */
	public OvhCopperInfo copperInfo;

	/**
	 * Line number
	 *
	 * canBeNull
	 */
	public String lineNumber;
}
