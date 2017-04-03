package net.minidev.ovh.api.order.catalog;

/**
 * Describes of commercial offer of a product
 */
public class OvhProductPlan {
	/**
	 * Name that appears on invoice
	 *
	 * canBeNull && readOnly
	 */
	public String invoiceName;

	/**
	 * Strategy that follow the pricing when product is in consumption mode
	 *
	 * canBeNull && readOnly
	 */
	public String consumptionBillingStrategy;

	/**
	 * Describe the details of a commercial offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhProductOfferDetails details;

	/**
	 * List of addons
	 *
	 * canBeNull && readOnly
	 */
	public OvhAddonItem[] addonsFamily;

	/**
	 * Plan code identifier
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * Main mode: rental, consumption
	 *
	 * canBeNull && readOnly
	 */
	public String pricingType;
}
