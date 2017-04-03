package net.minidev.ovh.api.sslgateway;

/**
 * A structure describing the eligibility status of a domain
 */
public class OvhEligibilityStatus {
	/**
	 * Whether this domain is hosted by Ovh or not
	 *
	 * canBeNull
	 */
	public Boolean isHostedByOvh;

	/**
	 * Customer domain name
	 *
	 * canBeNull
	 */
	public String domain;

	/**
	 * Eligible IP(s) for this domain
	 *
	 * canBeNull
	 */
	public String[] ips;
}
