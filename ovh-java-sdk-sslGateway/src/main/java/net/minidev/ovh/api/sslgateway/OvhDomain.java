package net.minidev.ovh.api.sslgateway;

/**
 * Domain attached to an SSL Gateway
 */
public class OvhDomain {
	/**
	 * Domain name attached to your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Domain state
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainStateEnum state;

	/**
	 * Id of your domain
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
