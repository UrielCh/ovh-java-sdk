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
	 * If the hostedssl is currently bound to a report
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isReportable;

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
	 * Regenerable flag
	 *
	 * canBeNull && readOnly
	 */
	public Boolean regenerable;

	/**
	 * Status of the HostedSsl
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
