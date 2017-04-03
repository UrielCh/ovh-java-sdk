package net.minidev.ovh.api.cloud.usage;

import java.util.Date;

/**
 * Period
 */
public class OvhPeriod {
	/**
	 * Usage from
	 *
	 * canBeNull && readOnly
	 */
	public Date from;

	/**
	 * Usage to
	 *
	 * canBeNull && readOnly
	 */
	public Date to;
}
