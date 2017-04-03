package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Snapshot usage
 */
public class OvhSnapshotUsageDetail {
	/**
	 * Snapshot price
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * Snapshot region
	 *
	 * canBeNull
	 */
	public String region;

	/**
	 * Stored snapshot size in gigabytes
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> storedSize;
}
