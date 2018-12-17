package net.minidev.ovh.api.order;

/**
 * Price with it's currency and textual representation
 */
public class OvhPrice {
	/**
	 * canBeNull
	 */
	public String text;

	/**
	 * canBeNull
	 */
	public Double value;

	/**
	 * canBeNull
	 */
	public OvhCurrencyCodeEnum currencyCode;
}
