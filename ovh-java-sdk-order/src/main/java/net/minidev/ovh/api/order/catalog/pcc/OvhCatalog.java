package net.minidev.ovh.api.order.catalog.pcc;

import net.minidev.ovh.api.order.catalog.OvhProductPlan;

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
	 * Describes Commercial Ranges of a Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public OvhCommercialRange[] commercialRanges;

	/**
	 * Commercial offers
	 *
	 * canBeNull && readOnly
	 */
	public OvhProductPlan[] plans;
}
