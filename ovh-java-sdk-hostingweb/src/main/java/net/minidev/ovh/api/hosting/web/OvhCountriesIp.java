package net.minidev.ovh.api.hosting.web;

/**
 * Available clusterIp by country
 */
public class OvhCountriesIp {
	/**
	 * The whois country of the ip
	 *
	 * canBeNull
	 */
	public OvhCountryEnum country;

	/**
	 * The cluster ipv6
	 *
	 * canBeNull
	 */
	public String ipv6;

	/**
	 * The cluster ip
	 *
	 * canBeNull
	 */
	public String ip;
}
