package net.minidev.ovh.api.ip;

/**
 * Detailed statistics about your traffic
 */
public class OvhMitigationDetailedStats {
	/**
	 * ICMP protocol type
	 *
	 * canBeNull
	 */
	public Long icmpType;

	/**
	 * Used protocol. See RFC5237 for more information
	 *
	 * canBeNull
	 */
	public Long protocol;

	/**
	 * Traffic dest port
	 *
	 * canBeNull
	 */
	public Long destPort;

	/**
	 * ICMP protocol code
	 *
	 * canBeNull
	 */
	public Long icmpCode;

	/**
	 * Traffic in
	 *
	 * canBeNull
	 */
	public OvhMitigationTraffic in;

	/**
	 * canBeNull
	 */
	public Boolean syn;

	/**
	 * canBeNull
	 */
	public Boolean fragments;

	/**
	 * Traffic source port
	 *
	 * canBeNull
	 */
	public Long srcPort;

	/**
	 * Traffic out
	 *
	 * canBeNull
	 */
	public OvhMitigationTraffic out;
}
