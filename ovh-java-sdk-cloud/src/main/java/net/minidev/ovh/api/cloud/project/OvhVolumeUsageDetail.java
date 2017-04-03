package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Volume usage
 */
public class OvhVolumeUsageDetail {
	/**
	 * Volume type
	 *
	 * canBeNull
	 */
	public OvhVolumeType volumeType;

	/**
	 * Volume capacity in gigabytes
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Long> volumeCapacity;

	/**
	 * Volume price
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * Volume id
	 *
	 * canBeNull
	 */
	public String volumeId;
}
