package net.minidev.ovh.api.service.renew;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Prices for renew forecasting
 */
public class OvhRenewForecastDetailPrices {
	/**
	 * Total price with tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice withTax;

	/**
	 * Total price without tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice withoutTax;

	/**
	 * Tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice tax;
}
