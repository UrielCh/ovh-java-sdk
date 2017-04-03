package net.minidev.ovh.api.hosting.web;

/**
 * Hostedssl
 */
public class OvhSsl {
	/**
	 * Provider of the HostedSsl
	 *
	 * canBeNull && readOnly
	 */
	public String provider;

	/**
	 * Type of the HostedSsl
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Status of the HostedSsl
	 *
	 * canBeNull && readOnly
	 */
	public String status;

	/**
	 * Regenerable flag
	 *
	 * canBeNull && readOnly
	 */
	public Boolean regenerable;
}
