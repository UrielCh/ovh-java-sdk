package net.minidev.ovh.api.order.catalog;

import net.minidev.ovh.api.complextype.OvhSafeKeyValue;

/**
 * Describe a Product in the Catalog
 */
public class OvhProduct {
	/**
	 * List of the metadata of the product
	 *
	 * canBeNull && readOnly
	 */
	public OvhSafeKeyValue<String>[] metadatas;

	/**
	 * Technicals details about product
	 *
	 * canBeNull && readOnly
	 */
	public OvhSafeKeyValue<String>[] technicalDetails;

	/**
	 * List of the configurations available for the product
	 *
	 * canBeNull && readOnly
	 */
	public OvhConfigurationItem[] configurations;

	/**
	 * Plan code identifier of the product
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Designation of the product
	 *
	 * canBeNull && readOnly
	 */
	public String description;
}
