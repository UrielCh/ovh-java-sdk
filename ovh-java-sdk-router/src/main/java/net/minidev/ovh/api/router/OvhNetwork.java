package net.minidev.ovh.api.router;

import java.util.Date;

/**
 * Network
 */
public class OvhNetwork {
	/**
	 * canBeNull && readOnly
	 */
	public Long vlanTag;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Gateway IP / CIDR Netmask
	 *
	 * canBeNull && readOnly
	 */
	public String ipNet;

	/**
	 * canBeNull && readOnly
	 */
	public OvhIpStatusEnum status;
}
