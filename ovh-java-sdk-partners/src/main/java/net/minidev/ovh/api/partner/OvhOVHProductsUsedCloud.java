package net.minidev.ovh.api.partner;

/**
 * Possible options for OVHProductsUsed_cloud
 */
public class OvhOVHProductsUsedCloud {
	/**
	 * NAS
	 *
	 * canBeNull && readOnly
	 */
	public Boolean nas;

	/**
	 * Dedicated Serveurs
	 *
	 * canBeNull && readOnly
	 */
	public Boolean dedicated;

	/**
	 * VPS
	 *
	 * canBeNull && readOnly
	 */
	public Boolean vps;

	/**
	 * Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public Boolean privateCloud;

	/**
	 * vRack / vRack Connect
	 *
	 * canBeNull && readOnly
	 */
	public Boolean vrack;

	/**
	 * Cloud Desktop Infrastructure
	 *
	 * canBeNull && readOnly
	 */
	public Boolean cloudDesktopInfrastructure;

	/**
	 * Public Cloud
	 *
	 * canBeNull && readOnly
	 */
	public Boolean publicCloud;

	/**
	 * Cloud Desktop
	 *
	 * canBeNull && readOnly
	 */
	public Boolean cloudDesktop;

	/**
	 * Network and security solutions
	 *
	 * canBeNull && readOnly
	 */
	public Boolean networkAndSecurity;
}
