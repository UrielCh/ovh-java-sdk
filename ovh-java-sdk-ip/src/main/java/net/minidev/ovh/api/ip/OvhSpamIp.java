package net.minidev.ovh.api.ip;

import java.util.Date;

/**
 * Your IP spam stats
 */
public class OvhSpamIp {
	/**
	 * Last date the ip was blocked
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * IP address which is sending spam
	 *
	 * canBeNull && readOnly
	 */
	public String ipSpamming;

	/**
	 * Current state of the ip
	 *
	 * canBeNull && readOnly
	 */
	public OvhSpamStateEnum state;

	/**
	 * Time (in seconds) while the IP will be blocked
	 *
	 * canBeNull && readOnly
	 */
	public Long time;
}
