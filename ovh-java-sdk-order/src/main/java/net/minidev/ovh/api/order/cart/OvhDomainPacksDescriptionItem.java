package net.minidev.ovh.api.order.cart;

/**
 * Describe the eligibility of each domain in the packs
 */
public class OvhDomainPacksDescriptionItem {
	/**
	 * Domain concerned by the availability
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Indicates if domain is available and will be included in the pack
	 *
	 * canBeNull && readOnly
	 */
	public Boolean available;
}
