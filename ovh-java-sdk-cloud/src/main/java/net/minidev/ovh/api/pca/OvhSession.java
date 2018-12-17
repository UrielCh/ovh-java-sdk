package net.minidev.ovh.api.pca;

import java.util.Date;
import net.minidev.ovh.api.cloud.pca.OvhSessionStateEnum;

/**
 * cloud archives sessions
 */
public class OvhSession {
	/**
	 * IP session was made from
	 *
	 * canBeNull && readOnly
	 */
	public String srcIp;

	/**
	 * Session size, in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * Session end date
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Session friendly name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Session ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Session state
	 *
	 * canBeNull && readOnly
	 */
	public OvhSessionStateEnum state;

	/**
	 * This is your login
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Session start date
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;
}
