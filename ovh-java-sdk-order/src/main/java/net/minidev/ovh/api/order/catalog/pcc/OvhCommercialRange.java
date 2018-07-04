package net.minidev.ovh.api.order.catalog.pcc;

/**
 * Describes the Commercial Range of a Private Cloud
 */
public class OvhCommercialRange {
	/**
	 * Describes Private Cloud Datacenters
	 *
	 * canBeNull && readOnly
	 */
	public OvhDatacenter[] datacenters;

	/**
	 * Name of the commercial range
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Default datacenter of the commercial range
	 *
	 * canBeNull && readOnly
	 */
	public String defaultZone;
}
