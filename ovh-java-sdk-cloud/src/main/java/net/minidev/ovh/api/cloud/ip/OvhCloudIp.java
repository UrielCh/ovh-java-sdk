package net.minidev.ovh.api.cloud.ip;

/**
 * CloudIp
 */
public class OvhCloudIp {
	/**
	 * Ip
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Ip id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Ip type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Ip status
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpStatusEnum status;
}
