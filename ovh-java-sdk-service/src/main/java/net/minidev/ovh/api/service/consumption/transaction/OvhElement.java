package net.minidev.ovh.api.service.consumption.transaction;

import net.minidev.ovh.api.order.OvhPrice;
import net.minidev.ovh.api.service.consumption.transaction.element.OvhDetail;

/**
 * Element of consumption for resource
 */
public class OvhElement {
	/**
	 * Consumption quantity
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Consumption amount price
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * List of consumption details for this planCode
	 *
	 * canBeNull && readOnly
	 */
	public OvhDetail[] details;

	/**
	 * Identifier of the offer
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;
}
