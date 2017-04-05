package net.minidev.ovh.api.partner;

/**
 * Possible choices for OVHProductsUsed
 */
public class OvhOVHProductsUsed {
	/**
	 * Cloud solutions
	 *
	 * canBeNull && readOnly
	 */
	public OvhOVHProductsUsedCloud cloud;

	/**
	 * WEB solutions
	 *
	 * canBeNull && readOnly
	 */
	public OvhOVHProductsUsedWeb web;

	/**
	 * Telecom solutions
	 *
	 * canBeNull && readOnly
	 */
	public OvhOVHProductsUsedTelecom telecom;

	/**
	 * Mobile Hosting solutions
	 *
	 * canBeNull && readOnly
	 */
	public OvhOVHProductsUsedMobileHosting mobileHosting;
}
