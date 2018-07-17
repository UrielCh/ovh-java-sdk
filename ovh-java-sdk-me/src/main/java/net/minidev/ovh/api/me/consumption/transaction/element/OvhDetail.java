package net.minidev.ovh.api.me.consumption.transaction.element;

/**
 * Element of consumption for resource
 */
public class OvhDetail {
	/**
	 * Consumption quantity
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Unique ID associated to one service element
	 *
	 * canBeNull && readOnly
	 */
	public String unique_id;
}
