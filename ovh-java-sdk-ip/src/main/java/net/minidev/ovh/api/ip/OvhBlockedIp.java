package net.minidev.ovh.api.ip;

import java.util.Date;

/**
 * Blocked IP information
 */
public class OvhBlockedIp {
	/**
	 * your IP
	 *
	 * canBeNull && readOnly
	 */
	public String ipBlocked;

	/**
	 * The last blocking date
	 *
	 * canBeNull && readOnly
	 */
	public Date blockedSince;

	/**
	 * this IP address state
	 *
	 * canBeNull && readOnly
	 */
	public OvhBlockedIpStateEnum state;

	/**
	 * Time (in seconds) remaining before you can request your IP to be unblocked
	 *
	 * canBeNull && readOnly
	 */
	public Long time;

	/**
	 * Logs
	 *
	 * canBeNull && readOnly
	 */
	public String logs;
}
