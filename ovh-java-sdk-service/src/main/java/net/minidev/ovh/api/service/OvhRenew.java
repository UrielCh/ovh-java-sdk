package net.minidev.ovh.api.service;

import net.minidev.ovh.api.service.renew.OvhInterval;
import net.minidev.ovh.api.service.renew.OvhMode;

/**
 * Renew information
 */
public class OvhRenew {
	/**
	 * Renewal mode
	 *
	 * canBeNull
	 */
	public OvhMode mode;

	/**
	 * Renew day number
	 *
	 * canBeNull
	 */
	public Long dayOfMonth;

	/**
	 * Possible interval between each renewal
	 *
	 * canBeNull
	 */
	public OvhInterval[] possibleIntervals;

	/**
	 * Interval between each renewal
	 *
	 * canBeNull
	 */
	public OvhInterval interval;

	/**
	 * Possible renewal mode
	 *
	 * canBeNull
	 */
	public OvhMode[] possibleModes;
}
