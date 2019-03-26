package net.minidev.ovh.api.me.consumption;

import java.util.Date;
import net.minidev.ovh.api.me.consumption.transaction.OvhElement;

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
	 * Last update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * List of product plan code consumption
	 *
	 * canBeNull && readOnly
	 */
	public OvhElement[] elements;

	/**
	 * Transaction ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Service ID
	 *
	 * canBeNull && readOnly
	 */
	public Long serviceId;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
