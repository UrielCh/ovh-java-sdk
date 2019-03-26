package net.minidev.ovh.api.order.cart;

/**
 * Representation of a cart item
 */
public class OvhItem {
	/**
	 * Duration for the service
	 *
	 * canBeNull && readOnly
	 */
	public String duration;

	/**
	 * Current product identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long itemId;

	/**
	 * Domain related settings
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainSettings settings;

	/**
	 * Id of parent item (if item is an option)
	 *
	 * canBeNull && readOnly
	 */
	public Long parentItemId;

	/**
	 * Type of the product added
	 *
	 * canBeNull && readOnly
	 */
	public String productId;

	/**
	 * Configuration set for this product
	 *
	 * canBeNull && readOnly
	 */
	public Long[] configurations;

	/**
	 * Cart identifier
	 *
	 * canBeNull && readOnly
	 */
	public String cartId;

	/**
	 * Options item ID attached to this item
	 *
	 * canBeNull && readOnly
	 */
	public Long[] options;

	/**
	 * Offer unique identifier of the product added
	 *
	 * canBeNull && readOnly
	 */
	public String offerId;

	/**
	 * Price of the item
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice[] prices;
}
