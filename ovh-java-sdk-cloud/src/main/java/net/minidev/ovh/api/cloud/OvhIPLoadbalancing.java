package net.minidev.ovh.api.cloud;

/**
 * Load balancing IP imported into your OpenStack project
 */
public class OvhIPLoadbalancing {
	/**
	 * validation url
	 *
	 * canBeNull && readOnly
	 */
	public String validationUrl;

	/**
	 * ID of your load balancing ip import
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * IPLB service name
	 *
	 * canBeNull && readOnly
	 */
	public String iplb;

	/**
	 * Status of your import
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
