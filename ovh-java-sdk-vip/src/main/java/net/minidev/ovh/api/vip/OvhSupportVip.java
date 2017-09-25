package net.minidev.ovh.api.vip;

/**
 * Vip Service
 */
public class OvhSupportVip {
	/**
	 * VIP universes of this service
	 *
	 * canBeNull && readOnly
	 */
	public OvhUniverseEnum[] universe;

	/**
	 * Name of the VIP offer
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
