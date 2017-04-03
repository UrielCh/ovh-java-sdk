package net.minidev.ovh.api.dedicated.server;

import java.util.Date;

/**
 * A structure describing ipmi access value
 */
public class OvhIpmiAccessValue {
	/**
	 * Session expiration date
	 *
	 * canBeNull
	 */
	public Date expiration;

	/**
	 * value
	 *
	 * canBeNull
	 */
	public String value;
}
