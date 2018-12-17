package net.minidev.ovh.api.dedicated.server;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Server bandwidth burst details
 */
public class OvhServerBurst {
	/**
	 * Bandwidth busrt capacity
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> capacity;

	/**
	 * indicates wether burstable bandwidth is currently active, allowing it to temporarily exceed the normally included bandwidth.OvhToInternet amount, within the limits indicated by the burst.capacity item. It can also be inactiveLocked when temporarily disabled due to overuse, capping it to the included non-burstable bandwidth capacity of bandwidth.OvhToInternet
	 *
	 * canBeNull && readOnly
	 */
	public OvhBurstStatusEnum status;
}
