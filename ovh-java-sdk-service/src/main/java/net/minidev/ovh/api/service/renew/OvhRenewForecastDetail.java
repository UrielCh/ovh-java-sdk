package net.minidev.ovh.api.service.renew;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Representation of a product renew pricing
 */
public class OvhRenewForecastDetail {
	/**
	 * Price for one unit
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice unitPrice;

	/**
	 * Quantity
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice totalPrice;

	/**
	 * Detail description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Associated service name
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
