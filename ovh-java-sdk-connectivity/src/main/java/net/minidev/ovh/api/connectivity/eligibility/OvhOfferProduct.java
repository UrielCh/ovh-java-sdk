package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Offer product
 */
public class OvhOfferProduct {
	/**
	 * Upload rate in Mb
	 *
	 * canBeNull
	 */
	public Double uploadRate;

	/**
	 * Download rate in Mb
	 *
	 * canBeNull
	 */
	public Double downloadRate;

	/**
	 * Product code, an unique identifier for the product
	 *
	 * canBeNull
	 */
	public String code;

	/**
	 * Provider
	 *
	 * canBeNull
	 */
	public OvhOfferProductProviderEnum provider;

	/**
	 * GRT (Guaranteed Restoration Time) available list
	 *
	 * canBeNull
	 */
	public String[] grt;

	/**
	 * Name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Is the rates guaranteed ?
	 *
	 * canBeNull
	 */
	public Boolean guaranteed;

	/**
	 * Type of the product
	 *
	 * canBeNull
	 */
	public OvhOfferProductTypeEnum type;

	/**
	 * Number of copper pairs required, for copper only
	 *
	 * canBeNull
	 */
	public Long pairs;
}
