package net.minidev.ovh.api.order.cart;

import java.util.Date;

/**
 * A shopping cart
 */
public class OvhCart {
	/**
	 * Expiration time
	 *
	 * canBeNull && readOnly
	 */
	public Date expire;

	/**
	 * Cart identifier
	 *
	 * canBeNull && readOnly
	 */
	public String cartId;

	/**
	 * Description of your cart
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Indicates if the cart has already been validated
	 *
	 * canBeNull && readOnly
	 */
	public Boolean readOnly;

	/**
	 * Items of your cart
	 *
	 * canBeNull && readOnly
	 */
	public Long[] items;
}
