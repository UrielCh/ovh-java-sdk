package net.minidev.ovh.api.order.catalog.privatecloud;

/**
 * Describe a Private Cloud commercial catalog
 */
public class OvhCatalog {
	/**
	 * Catalog name
	 *
	 * canBeNull && readOnly
	 */
	public String catalogName;

	/**
	 * OVH Subsidiary of the Catalog
	 *
	 * canBeNull && readOnly
	 */
	public String merchantCode;

	/**
	 * Catalog ID
	 *
	 * canBeNull && readOnly
	 */
	public Long catalogId;

	/**
	 * Describe all capabilities of different types of service
	 *
	 * canBeNull && readOnly
	 */
	public OvhCapabilitiesListing options;

	/**
	 * Default datacenter for this catalog
	 *
	 * canBeNull && readOnly
	 */
	public String defaultZone;

	/**
	 * Default hypervisor for this catalog
	 *
	 * canBeNull && readOnly
	 */
	public String defaultHypervisor;

	/**
	 * Zone definitions per datacenters
	 *
	 * canBeNull && readOnly
	 */
	public OvhZonesListing zones;
}
