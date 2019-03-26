package net.minidev.ovh.api.ip;

/**
 * Traffic statistics in and out on a mitigated ip
 */
public class OvhMitigationStats {
	/**
	 * Traffic in
	 *
	 * canBeNull
	 */
	public OvhMitigationTraffic in;

	/**
	 * Traffic timestamp
	 *
	 * canBeNull
	 */
	public Long timestamp;

	/**
	 * Traffic out
	 *
	 * canBeNull
	 */
	public OvhMitigationTraffic out;
}
