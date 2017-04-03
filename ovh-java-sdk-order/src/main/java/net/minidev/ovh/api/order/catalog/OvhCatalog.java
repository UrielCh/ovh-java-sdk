package net.minidev.ovh.api.order.catalog;

/**
 * Describes a Catalog
 */
public class OvhCatalog {
	/**
	 * OVH Subsidiary concerned by this catalog
	 *
	 * canBeNull && readOnly
	 */
	public String merchantCode;

	/**
	 * Identifier of the catalog
	 *
	 * canBeNull && readOnly
	 */
	public Long catalogId;

	/**
	 * List of plans of the catalog
	 *
	 * canBeNull && readOnly
	 */
	public OvhPlansItem[] plansFamily;
}
