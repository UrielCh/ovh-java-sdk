package net.minidev.ovh.api.order.cart;

/**
 * Information about a Domain Packs offer information
 */
public class OvhDomainPacksProductInformation {
	/**
	 * Specific details about domain packs offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainPacksDescription description;

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
