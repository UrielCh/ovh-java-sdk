package net.minidev.ovh.api.cloud.instance;

import java.util.Date;
import net.minidev.ovh.api.cloud.flavor.OvhFlavor;
import net.minidev.ovh.api.cloud.image.OvhImage;
import net.minidev.ovh.api.cloud.sshkey.OvhSshKeyDetail;

/**
 * InstanceDetail
 */
public class OvhInstanceDetail {
	/**
	 * Instance flavor
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlavor flavor;

	/**
	 * Instance image
	 *
	 * canBeNull && readOnly
	 */
	public OvhImage image;

	/**
	 * Instance SSH key
	 *
	 * canBeNull && readOnly
	 */
	public OvhSshKeyDetail sshKey;

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
