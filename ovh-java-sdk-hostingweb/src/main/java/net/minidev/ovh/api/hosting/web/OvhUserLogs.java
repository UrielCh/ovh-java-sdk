package net.minidev.ovh.api.hosting.web;

import java.util.Date;

/**
 * Hosting users logs
 */
public class OvhUserLogs {
	/**
	 * Description field for you
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Date of the user creation
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * The userLogs login used to connect to logs.ovh.net
	 *
	 * canBeNull && readOnly
	 */
	public String login;
}
