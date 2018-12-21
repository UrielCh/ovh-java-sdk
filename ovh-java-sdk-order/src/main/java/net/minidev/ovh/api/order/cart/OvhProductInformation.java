package net.minidev.ovh.api.order.cart;

/**
 * Information about a product for Order/Cart
 */
public class OvhProductInformation {
	/**
	 * List all the duration allowed for the product
	 *
	 * canBeNull && readOnly
	 */
	public String[] duration;

	/**
	 * Informations about the domain's offer (gold|diamond|platinium)
	 *
	 * canBeNull && readOnly
	 */
	public String offer;

	/**
	 * Informations about the domain phase
	 *
	 * canBeNull && readOnly
	 */
	public String phase;

	/**
	 * Pricing model identifier for this product
	 *
	 * canBeNull && readOnly
	 */
	public String pricingMode;

	/**
	 * Product identifier
	 *
	 * canBeNull && readOnly
	 */
	public String productId;

	/**
	 * Maximum quantity purchasable for this product
	 *
	 * canBeNull && readOnly
	 */
	public Long quantityMax;

	/**
	 * Informations about the estimated delivery time for the product
	 *
	 * canBeNull && readOnly
	 */
	public String deliveryTime;

	/**
	 * Informations about the configurations required
	 *
	 * canBeNull && readOnly
	 */
	public OvhConfigurationRequirements[] configurations;

	/**
	 * Indicates if the product is orderable or not
	 *
	 * canBeNull && readOnly
	 */
	public Boolean orderable;

	/**
	 * Price details of the product
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice[] prices;
}
