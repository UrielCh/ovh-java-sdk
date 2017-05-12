package net.minidev.ovh.api.sslgateway;

/**
 * A structure describing the eligibility status of a domain
 */
public class OvhEligibilityStatus {
	/**
	 * Eligible IP(s) v6 for this domain
	 *
	 * canBeNull
	 */
	public String[] ip6s;

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
