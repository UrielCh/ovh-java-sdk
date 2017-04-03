package net.minidev.ovh.api.cloud.reserved;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Booking
 */
public class OvhBooking {
	/**
	 * Booking duration in hours
	 *
	 * canBeNull && readOnly
	 */
	public Long duration;

	/**
	 * Name of booked flavor
	 *
	 * canBeNull && readOnly
	 */
	public String flavorName;

	/**
	 * Quantity of instances booked
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice price;

	/**
	 * ID of booked flavor
	 *
	 * canBeNull && readOnly
	 */
	public String flavorId;

	/**
	 * Booking end time
	 *
	 * canBeNull && readOnly
	 */
	public Date end;

	/**
	 * Region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Booking begin time
	 *
	 * canBeNull && readOnly
	 */
	public Date begin;
}
