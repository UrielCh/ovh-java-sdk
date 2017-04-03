package net.minidev.ovh.api.order.catalog;

import net.minidev.ovh.api.complextype.OvhSafeKeyValue;

/**
 * Describe the details of a commercial offer
 */
public class OvhProductOfferDetails {
	/**
	 * Information about the product
	 *
	 * canBeNull && readOnly
	 */
	public OvhProduct product;

	/**
	 * List of the metadatas attached
	 *
	 * canBeNull && readOnly
	 */
	public OvhSafeKeyValue<String>[] metadatas;

	/**
	 * Describe default pricings
	 *
	 * canBeNull && readOnly
	 */
	public OvhPricingDefault pricings;
}
