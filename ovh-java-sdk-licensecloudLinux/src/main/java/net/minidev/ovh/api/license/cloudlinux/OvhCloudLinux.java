package net.minidev.ovh.api.license.cloudlinux;

import java.util.Date;
import net.minidev.ovh.api.license.OvhCloudLinuxVersionEnum;
import net.minidev.ovh.api.license.OvhStateEnum;

/**
 * Your CloudLinux license
 */
public class OvhCloudLinux {
	/**
	 * The internal name of your license
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * The ip on which this license is attached
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * The license id on license provider side
	 *
	 * canBeNull && readOnly
	 */
	public String licenseId;

	/**
	 * This license version
	 *
	 * canBeNull && readOnly
	 */
	public OvhCloudLinuxVersionEnum version;

	/**
	 * This license creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creation;

	/**
	 * This license state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum status;
}
