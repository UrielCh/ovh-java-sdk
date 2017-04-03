package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Log entry of an auth attempt to the radius server
 */
public class OvhRadiusConnectionLog {
	/**
	 * canBeNull
	 */
	public Date date;

	/**
	 * canBeNull
	 */
	public String state;

	/**
	 * canBeNull
	 */
	public String login;

	/**
	 * canBeNull
	 */
	public String message;
}
