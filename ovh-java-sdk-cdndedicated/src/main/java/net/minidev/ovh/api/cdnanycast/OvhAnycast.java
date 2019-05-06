package net.minidev.ovh.api.cdnanycast;

import java.util.Date;

/**
 * Anycast IP of a CDN customer
 */
public class OvhAnycast {
	/**
	 * canBeNull && readOnly
	 */
	public String offer;

	/**
	 * canBeNull && readOnly
	 */
	public Long cacheRuleLimitPerDomain;

	/**
	 * canBeNull && readOnly
	 */
	public String anycast;

	/**
	 * canBeNull && readOnly
	 */
	public Long backendUse;

	/**
	 * canBeNull && readOnly
	 */
	public Long backendLimit;

	/**
	 * The internal name of your CDN offer
	 *
	 * canBeNull && readOnly
	 */
	public String service;

	/**
	 * canBeNull && readOnly
	 */
	public Long quota;

	/**
	 * URL for downloading daily log of your CDN
	 *
	 * canBeNull && readOnly
	 */
	public String logUrl;

	/**
	 * canBeNull && readOnly
	 */
	public Date lastQuotaOrder;
}
