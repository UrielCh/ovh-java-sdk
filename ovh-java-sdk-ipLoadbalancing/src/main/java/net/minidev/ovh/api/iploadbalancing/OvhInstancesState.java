package net.minidev.ovh.api.iploadbalancing;

import java.util.Date;

/**
 * A structure describing the current state of an IPLB instances
 */
public class OvhInstancesState {
	/**
	 * Internal ID of this IPLB instance
	 *
	 * canBeNull
	 */
	public Long internalId;

	/**
	 * zone of this IPLB instance
	 *
	 * canBeNull
	 */
	public String zone;

	/**
	 * Last update date
	 *
	 * canBeNull
	 */
	public Date lastUpdateDate;

	/**
	 * Current state of this IPLB instance
	 *
	 * canBeNull
	 */
	public String state;
}
