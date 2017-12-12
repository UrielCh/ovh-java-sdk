package net.minidev.ovh.api.cloud.openstackclient;

import java.util.Date;

/**
 * Session
 */
public class OvhSession {
	/**
	 * Expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expires;

	/**
	 * Websocket url to use the terminal
	 *
	 * canBeNull && readOnly
	 */
	public String websocket;

	/**
	 * Profile of the session
	 *
	 * canBeNull && readOnly
	 */
	public OvhProfile profile;

	/**
	 * Session Id
	 *
	 * canBeNull && readOnly
	 */
	public String id;
}
