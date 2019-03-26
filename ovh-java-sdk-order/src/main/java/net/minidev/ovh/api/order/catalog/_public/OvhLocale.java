package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.nichandle.OvhOvhSubsidiaryEnum;
import net.minidev.ovh.api.order.OvhCurrencyCodeEnum;

/**
 * Describes specifics for a given Subsidiary
 */
public class OvhLocale {
	/**
	 * Default VAT rate used by the Subsidiary
	 *
	 * canBeNull && readOnly
	 */
	public Double taxRate;

	/**
	 * Currency used by the Subsidiary
	 *
	 * canBeNull && readOnly
	 */
	public OvhCurrencyCodeEnum currencyCode;

	/**
	 * Current Subsidiary
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhSubsidiaryEnum subsidiary;
}
