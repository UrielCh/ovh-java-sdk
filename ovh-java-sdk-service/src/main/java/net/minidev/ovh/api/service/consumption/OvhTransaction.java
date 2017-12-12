package net.minidev.ovh.api.service.consumption;

import java.util.Date;

/**
 * List of consumptions recorded in a range
 */
public class OvhTransaction {
	/**
	 * List of recorded consumptions
	 *
	 * canBeNull && readOnly
	 */
	public OvhConsumption[] consumptions;

	/**
	 * Consumptions end date
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Transaction Id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Consumptions start date
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;
}
