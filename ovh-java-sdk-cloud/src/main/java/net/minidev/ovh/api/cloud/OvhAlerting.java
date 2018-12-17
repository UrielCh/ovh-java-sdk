package net.minidev.ovh.api.cloud;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Cloud alerting consumption
 */
public class OvhAlerting {
	/**
	 * Formatted monthly threshold for this alerting
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice formattedMonthlyThreshold;

	/**
	 * Delay between alerts in seconds
	 *
	 * canBeNull && readOnly
	 */
	public OvhAlertingDelayEnum delay;

	/**
	 * Monthly threshold for this alerting
	 *
	 * canBeNull && readOnly
	 */
	public Long monthlyThreshold;

	/**
	 * Alerting unique UUID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Alerting creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Email to contact
	 *
	 * canBeNull && readOnly
	 */
	public String email;
}
