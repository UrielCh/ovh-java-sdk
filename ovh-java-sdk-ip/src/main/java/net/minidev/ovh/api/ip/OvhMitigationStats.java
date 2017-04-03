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
	 * Traffic out
	 *
	 * canBeNull
	 */
	public OvhMitigationTraffic out;

	/**
	 * Traffic timestamp
	 *
	 * canBeNull
	 */
	public Long timestamp;
}
