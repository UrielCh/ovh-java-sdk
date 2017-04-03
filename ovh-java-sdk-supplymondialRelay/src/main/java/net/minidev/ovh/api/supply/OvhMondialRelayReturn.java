package net.minidev.ovh.api.supply;

/**
 * Status and Mondial Relay Point Details
 */
public class OvhMondialRelayReturn {
	/**
	 * Relay points list and reference address
	 *
	 * canBeNull
	 */
	public OvhMondialRelayResult result;

	/**
	 * Error
	 *
	 * canBeNull
	 */
	public String error;

	/**
	 * Request status
	 *
	 * canBeNull
	 */
	public OvhStatus status;
}
