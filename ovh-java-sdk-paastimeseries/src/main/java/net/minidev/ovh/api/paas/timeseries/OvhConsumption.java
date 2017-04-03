package net.minidev.ovh.api.paas.timeseries;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Consumption
 */
public class OvhConsumption {
	/**
	 * Total
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice total;

	/**
	 * Timestamp of consumption generation
	 *
	 * canBeNull && readOnly
	 */
	public Date generated;

	/**
	 * Consumption start date
	 *
	 * canBeNull && readOnly
	 */
	public Date from;

	/**
	 * Consumption end date
	 *
	 * canBeNull && readOnly
	 */
	public Date to;

	/**
	 * List of consumption items
	 *
	 * canBeNull && readOnly
	 */
	public OvhConsumptionItem[] items;
}
