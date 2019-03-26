package net.minidev.ovh.api.me.consumption;

import net.minidev.ovh.api.order.OvhCurrencyCodeEnum;

/**
 * Price with currency and amount in micro-cents
 */
public class OvhPrice {
	/**
	 * canBeNull && readOnly
	 */
	public String text;

	/**
	 * canBeNull && readOnly
	 */
	public OvhCurrencyCodeEnum currencyCode;

	/**
	 * canBeNull && readOnly
	 */
	public Double value;

	/**
	 * canBeNull && readOnly
	 */
	public Long valueInUcents;
}
