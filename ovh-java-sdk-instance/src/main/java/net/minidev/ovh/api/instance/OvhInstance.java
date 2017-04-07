package net.minidev.ovh.api.instance;

import java.util.Date;

/**
 * 
 */
public class OvhInstance {
	/**
	 * Instance image id
	 *
	 * canBeNull && readOnly
	 */
	public String imageId;

	/**
	 * Instance id
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

	/**
	 * Instance creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date created;

	/**
	 * Main IPv4
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Instance flavor id
	 *
	 * canBeNull && readOnly
	 */
	public String flavorId;

	/**
	 * Instance key name
	 *
	 * canBeNull && readOnly
	 */
	public String keyName;

	/**
	 * Instance name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Instance region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Instance status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
