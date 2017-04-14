package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.hostedssl.OvhStatusEnum;

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
	 * The task ID working on this HostedSsl
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Status of the HostedSsl
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;

	/**
	 * Regenerable flag
	 *
	 * canBeNull && readOnly
	 */
	public Boolean regenerable;
}
