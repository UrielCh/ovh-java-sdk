package net.minidev.ovh.api.cloud.instanceregion;

import java.util.Date;
import net.minidev.ovh.api.cloud.api.OvhResource;
import net.minidev.ovh.api.cloud.instance.OvhInstanceStatusEnum;
import net.minidev.ovh.api.cloud.instance.OvhMonthlyBilling;

/**
 * Instance
 */
public class OvhInstance {
	/**
	 * Instance flavor
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource flavor;

	/**
	 * Instance image
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource image;

	/**
	 * Instance ssh key
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource sshKey;

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
	 * Instance monthly billing status
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonthlyBilling monthlyBilling;

	/**
	 * Instance IP addresses
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpAddress[] ipAddresses;

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
	 * Instance status
	 *
	 * canBeNull && readOnly
	 */
	public OvhInstanceStatusEnum status;
}
