package net.minidev.ovh.api.vps;

import net.minidev.ovh.api.coretypes.OvhIpVersionEnum;
import net.minidev.ovh.api.vps.ip.OvhGeolocationEnum;
import net.minidev.ovh.api.vps.ip.OvhTypeEnum;

/**
 * Information about an IP address for a VPS Virtual Machine
 */
public class OvhIp {
	/**
	 * canBeNull && readOnly
	 */
	public String macAddress;

	/**
	 * The effective ip address of the Ip object
	 *
	 * canBeNull && readOnly
	 */
	public String ipAddress;

	/**
	 * canBeNull && readOnly
	 */
	public String reverse;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum type;

	/**
	 * canBeNull && readOnly
	 */
	public OvhIpVersionEnum version;

	/**
	 * canBeNull && readOnly
	 */
	public String gateway;

	/**
	 * canBeNull && readOnly
	 */
	public OvhGeolocationEnum geolocation;
}
