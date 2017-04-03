package net.minidev.ovh.api.order.cart;

import net.minidev.ovh.api.hosting.web.OvhCapabilities;

/**
 * Information about a Web Hosting offer information
 */
public class OvhWebHostingProductInformation {
	/**
	 * Specific details about web hosting offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhCapabilities description;

	/**
	 * Prices of the offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenericProductPricing[] prices;

	/**
	 * Identifier of the offer
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;
}
