package net.minidev.ovh.api.service.renew;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Representation of a product renew pricing
 */
public class OvhRenewStrategy {
	/**
	 * Price of the product in micro-centims
	 *
	 * canBeNull && readOnly
	 */
	public Long priceInUcents;

	/**
	 * Price of the product
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * Services renewed by strategy
	 *
	 * canBeNull && readOnly
	 */
	public Long[] services;

	/**
	 * Details of services renewed by strategy
	 *
	 * canBeNull && readOnly
	 */
	public OvhService[] servicesDetails;
}
