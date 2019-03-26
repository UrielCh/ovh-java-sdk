package net.minidev.ovh.api.paas.timeseries;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.order.OvhPrice;
import net.minidev.ovh.api.tsaas.OvhMetricNameEnum;

/**
 * ConsumptionItem
 */
public class OvhConsumptionItem {
	/**
	 * Unit price
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice unitPrice;

	/**
	 * Metric name
	 *
	 * canBeNull && readOnly
	 */
	public OvhMetricNameEnum metricName;

	/**
	 * Quantity consumed in unit
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> quantity;

	/**
	 * Price
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;
}
