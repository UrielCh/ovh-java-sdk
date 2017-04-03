package net.minidev.ovh.api.xdsl;

import net.minidev.ovh.api.coretypes.OvhIpVersionEnum;

/**
 * Informations about an IP address
 */
public class OvhIP {
	/**
	 * The IP address
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * canBeNull && readOnly
	 */
	public Long range;

	/**
	 * canBeNull && readOnly
	 */
	public String[] dnsList;

	/**
	 * canBeNull && readOnly
	 */
	public OvhIpVersionEnum version;

	/**
	 * status of the IP
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpStatusEnum status;
}
