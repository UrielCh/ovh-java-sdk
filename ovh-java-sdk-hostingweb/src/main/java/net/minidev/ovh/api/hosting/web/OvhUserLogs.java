package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.userlogs.OvhStatusEnum;

/**
 * Hosting users logs
 */
public class OvhUserLogs {
	/**
	 * OwnLogs where this userLogs will be enable. Default : main domain ownlogs
	 *
	 * canBeNull && readOnly
	 */
	public Long ownLogsId;

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

	/**
	 * Status of this userLogs
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
