package net.minidev.ovh.api.order.catalog.privatecloud;

/**
 * Zone definitions per datacenters
 */
public class OvhZonesListing {
	/**
	 * Zone definition for SBG datacenter
	 *
	 * canBeNull && readOnly
	 */
	public OvhZone sbg;

	/**
	 * Zone definition for RBX datacenter
	 *
	 * canBeNull && readOnly
	 */
	public OvhZone rbx;

	/**
	 * Zone definition for BHS datacenter
	 *
	 * canBeNull && readOnly
	 */
	public OvhZone bhs;
}
