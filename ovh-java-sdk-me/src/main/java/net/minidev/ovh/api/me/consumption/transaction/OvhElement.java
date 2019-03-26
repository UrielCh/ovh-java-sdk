package net.minidev.ovh.api.me.consumption.transaction;

import net.minidev.ovh.api.me.consumption.OvhPrice;
import net.minidev.ovh.api.me.consumption.transaction.element.OvhDetail;

/**
 * Element of consumption for resource
 */
public class OvhElement {
	/**
	 * Family of the offer
	 *
	 * canBeNull && readOnly
	 */
	public String planFamily;

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
