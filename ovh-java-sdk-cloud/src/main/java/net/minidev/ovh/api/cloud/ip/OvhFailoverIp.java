package net.minidev.ovh.api.cloud.ip;

/**
 * FailoverIp
 */
public class OvhFailoverIp {
	/**
	 * Instance where ip is routed to
	 *
	 * canBeNull && readOnly
	 */
	public String routedTo;

	/**
	 * Ip
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Ip location
	 *
	 * canBeNull && readOnly
	 */
	public String geoloc;

	/**
	 * Current operation progress in percent
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * IP sub type
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpSubTypeEnum subType;

	/**
	 * IP block
	 *
	 * canBeNull && readOnly
	 */
	public String block;

	/**
	 * Ip id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Ip status
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpStatusEnum status;

	/**
	 * Ip continent
	 *
	 * canBeNull && readOnly
	 */
	public String continentCode;
}
