package net.minidev.ovh.api.service.consumption;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;
import net.minidev.ovh.api.service.consumption.transaction.OvhElement;

/**
 * List of consumptions recorded in a range
 */
public class OvhTransaction {
	/**
	 * Begin date
	 *
	 * canBeNull && readOnly
	 */
	public Date beginDate;

	/**
	 * End date
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Consumption amount price
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * List of product plan code consumption
	 *
	 * canBeNull && readOnly
	 */
	public OvhElement[] elements;

	/**
	 * Last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Transaction ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Service ID
	 *
	 * canBeNull && readOnly
	 */
	public Long serviceId;
}
