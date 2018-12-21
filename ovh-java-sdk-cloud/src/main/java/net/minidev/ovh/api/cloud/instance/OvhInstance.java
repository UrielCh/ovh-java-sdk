package net.minidev.ovh.api.cloud.instance;

import java.util.Date;

/**
 * Instance
 */
public class OvhInstance {
	/**
	 * Instance image id
	 *
	 * canBeNull && readOnly
	 */
	public String imageId;

	/**
	 * Instance creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date created;

	/**
	 * Instance name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Instance flavor id
	 *
	 * canBeNull && readOnly
	 */
	public String flavorId;

	/**
	 * Instance IP addresses
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpAddress[] ipAddresses;

	/**
	 * Instance monthly billing status
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonthlyBilling monthlyBilling;

	/**
	 * Instance id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Instance id
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Instance ssh key id
	 *
	 * canBeNull && readOnly
	 */
	public String sshKeyId;

	/**
	 * Order plan code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * Instance status
	 *
	 * canBeNull && readOnly
	 */
	public OvhInstanceStatusEnum status;
}
