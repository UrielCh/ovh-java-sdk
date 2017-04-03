package net.minidev.ovh.api.hosting.web.mail;

import java.util.Date;

/**
 * The volume history type
 */
public class OvhBounce {
	/**
	 * The datetime of this bounce
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * The email where you have the bounce
	 *
	 * canBeNull
	 */
	public String to;

	/**
	 * The return message for this bounce
	 *
	 * canBeNull
	 */
	public String message;
}
