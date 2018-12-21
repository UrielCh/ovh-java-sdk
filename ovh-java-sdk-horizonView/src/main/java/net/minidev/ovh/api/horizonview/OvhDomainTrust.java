package net.minidev.ovh.api.horizonview;

/**
 * List all Active Directories linked to your CDI Active Directory
 */
public class OvhDomainTrust {
	/**
	 * IP of your second DNS
	 *
	 * canBeNull && readOnly
	 */
	public String dns2;

	/**
	 * Name of your private domain
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * IP of your first DNS
	 *
	 * canBeNull && readOnly
	 */
	public String dns1;

	/**
	 * Domain trust id
	 *
	 * canBeNull && readOnly
	 */
	public Long domainTrustId;

	/**
	 * IP of your Active Directory
	 *
	 * canBeNull && readOnly
	 */
	public String activeDirectoryIP;
}
