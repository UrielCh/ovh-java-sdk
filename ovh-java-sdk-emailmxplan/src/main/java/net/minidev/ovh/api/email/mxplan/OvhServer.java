package net.minidev.ovh.api.email.mxplan;

import net.minidev.ovh.api.email.pro.OvhServerStateEnum;

/**
 * Server
 */
public class OvhServer {
	/**
	 * Total disk size in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long diskSize;

	/**
	 * If true your dns ptrV6 record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isPtrV6Valid;

	/**
	 * Current disk usage in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long currentDiskUsage;

	/**
	 * ipV6
	 *
	 * canBeNull && readOnly
	 */
	public String ipV6;

	/**
	 * ipV4
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * If true your dns ptr record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isPtrValid;

	/**
	 * If true your dns A record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isAValid;

	/**
	 * Server state
	 *
	 * canBeNull && readOnly
	 */
	public OvhServerStateEnum state;

	/**
	 * If true your dns AAAA record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isAaaaValid;

	/**
	 * Server version
	 *
	 * canBeNull && readOnly
	 */
	public Long version;

	/**
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
