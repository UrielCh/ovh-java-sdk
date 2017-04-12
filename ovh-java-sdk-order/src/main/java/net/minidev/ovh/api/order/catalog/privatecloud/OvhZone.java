package net.minidev.ovh.api.order.catalog.privatecloud;

import net.minidev.ovh.api.order.catalog.OvhProductPlan;

/**
 * Describe a Private Cloud zone
 */
public class OvhZone {
	/**
	 * Country where Private Cloud instance will be delivered
	 *
	 * canBeNull && readOnly
	 */
	public String country;

	/**
	 * Internal name of the zone
	 *
	 * canBeNull && readOnly
	 */
	public String internalName;

	/**
	 * City where Private Cloud instance will be delivered
	 *
	 * canBeNull && readOnly
	 */
	public String cityName;

	/**
	 * Commercial offers on this zone
	 *
	 * canBeNull && readOnly
	 */
	public OvhProductPlan[] plans;

	/**
	 * Default hypervisor for this Private Cloud zone
	 *
	 * canBeNull && readOnly
	 */
	public String defaultHypervisor;

	/**
	 * Default version for this Private Cloud zone
	 *
	 * canBeNull && readOnly
	 */
	public String defaultVersion;
}
