package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.order.cart.OvhGenericProductPricingTypeEnum;
import net.minidev.ovh.api.order.catalog._public.OvhAddonFamily;
import net.minidev.ovh.api.order.catalog._public.OvhConfiguration;
import net.minidev.ovh.api.order.catalog._public.OvhPricing;

/**
 * Describes a Commercial offer inside a Catalog
 */
public class OvhPlan {
	/**
	 * Identifier of the Product linked to this Commercial offer
	 *
	 * canBeNull && readOnly
	 */
	public String product;

	/**
	 * Commercial offer description
	 *
	 * canBeNull && readOnly
	 */
	public String invoiceName;

	/**
	 * List of possible Pricings for this Commercial offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhPricing[] pricings;

	/**
	 * List of possible Configurations for this Commercial offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhConfiguration[] configurations;

	/**
	 * Addon families for this offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhAddonFamily[] addonFamilies;

	/**
	 * Name of the family this Commercial offer belongs to
	 *
	 * canBeNull && readOnly
	 */
	public String family;

	/**
	 * Commercial offer identifier
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * Type of Pricing used by this Commercial offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricingTypeEnum pricingType;
}
