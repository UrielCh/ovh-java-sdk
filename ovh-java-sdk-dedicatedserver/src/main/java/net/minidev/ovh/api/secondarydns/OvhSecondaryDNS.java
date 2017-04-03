package net.minidev.ovh.api.secondarydns;

import java.util.Date;

/**
 * Secondary dns infos
 */
public class OvhSecondaryDNS {
	/**
	 * domain on slave server
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * secondary dns server
	 *
	 * canBeNull && readOnly
	 */
	public String dns;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * master ip
	 *
	 * canBeNull && readOnly
	 */
	public String ipMaster;
}
