package net.minidev.ovh.api.supply;

/**
 * Status and Mondial Relay Point Details
 */
public class OvhMondialRelayResult {
	/**
	 * Array of relay points
	 *
	 * canBeNull
	 */
	public OvhMondialRelay[] relayPoints;

	/**
	 * Reference address for finding RelayPoints
	 *
	 * canBeNull
	 */
	public String referenceAddress;
}
