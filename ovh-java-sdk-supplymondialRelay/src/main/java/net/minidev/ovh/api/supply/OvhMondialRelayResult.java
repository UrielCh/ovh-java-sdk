package net.minidev.ovh.api.supply;

/**
 * Status and Mondial Relay Point Details
 */
public class OvhMondialRelayResult {
	/**
	 * Reference address for finding RelayPoints
	 *
	 * canBeNull
	 */
	public String referenceAddress;

	/**
	 * Array of relay points
	 *
	 * canBeNull
	 */
	public OvhMondialRelay[] relayPoints;
}
